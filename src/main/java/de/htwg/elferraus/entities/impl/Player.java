package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.ICard;
import de.htwg.elferraus.entities.IMainArray;
import de.htwg.elferraus.entities.IMainStack;
import de.htwg.elferraus.entities.IStates;
import de.htwg.elferraus.entities.IPlayer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Tobi
 */
public class Player implements IPlayer {

    private static IMainArray playTable;
    private static IMainStack stack;
    private PlayerDeck deck;
    private IStates currentstate;
    private int pulledCards = 0;
    private static final int ELEVEN = 11;

    /**
     *
     * @param playTable
     * @param stack
     */
    public Player(IMainArray playTable, IMainStack stack) {
        this.stack = stack;
        this.playTable = playTable;
        deck = new PlayerDeck();
    }

    /**
     *
     * @param chosenCard
     * @return
     */
    public boolean setCard(ICard chosenCard) {
        boolean valid = false;
        String chosenColour = chosenCard.getColour();
        int chosenNumber = chosenCard.getNumber();
        if (chosenNumber == ELEVEN) {
            this.playTable.setEleven(chosenCard);
            valid = true;
        }
        if (playTable.isNotEmpty(chosenColour) && (chosenNumber + 1) == playTable.getLow(chosenColour).getNumber()) {
            playTable.setLow(chosenCard);
            valid = true;
        }
        if (playTable.isNotEmpty(chosenColour) && (chosenNumber - 1) == playTable.getHigh(chosenColour).getNumber()) {
            playTable.setHigh(chosenCard);
            valid = true;
        }
        return valid;
    }

    /**
     *
     * @return
     */
    public boolean getCard() {
        deck.addCard(stack.popCard());
        pulledCards++;
        return true;
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean setState(IStates s) {
        currentstate = s;
        pulledCards = 0;
        return true;
    }

    /**
     *
     * @param player
     * @param index
     * @param amount
     * @return
     */
    public int nextState(IPlayer player, int index, int amount) {
        return currentstate.next(this, index, amount);
    }

    /**
     *
     * @return
     */
    public int cardsOnHand() {
        return deck.getSize();
    }

    /**
     *
     * @param index
     * @return
     */
    public ICard cardToIndex(int index) {
        return deck.popplCard(deck.indexToCard(index));
    }

    /**
     *
     * @param c
     * @return
     */
    public boolean addCardtoHand(ICard c) {
        deck.addCard(c);
        return true;
    }

    /**
     *
     * @return
     */
    public int pulledCards() {
        return pulledCards;
    }

    /**
     *
     * @return
     */
    public int stackSize() {
        return stack.getAmount();
    }

    /**
     *
     * @return
     */
    public String printDeck() {
        return deck.toString();
    }

    /**
     *
     * @return
     */
    public String printTable() {
        return playTable.toString();
    }

    /**
     *
     * @return
     */
    public ICard takeCard() {
        return stack.popCard();
    }

    public HashMap<Integer, HashMap<String, Integer>> getTable() {
        HashMap<Integer, HashMap<String, Integer>> temp = new HashMap<Integer, HashMap<String, Integer>>();
        int count = 0;
        for (int i = 0; i < 4; i++) {
            String s = "x";
            if (i == 0) {
                s = "b";
            }
            if (i == 1) {
                s = "g";

            }
            if (i == 2) {
                s = "r";
            }
            if (i == 3) {
                s = "y";
            }
            Integer zahl;
            ICard temp2 = playTable.getLow(s);
            temp.put(count, new HashMap<String, Integer>());
            if (temp2 == null) {
                temp.get(count).put(s, null);
                count++;
                temp.get(count).put(s, null);
                count++;
                temp.get(count).put(s, null);
                count++;
                continue;
            } else {
                zahl = temp2.getNumber();
                if (zahl == 11) {
                    temp.get(count).put(s, null);
                } else {
                    temp.get(count).put(s, zahl);
                }
                count++;
                temp.get(count).put(s, 11);
                count++;
                temp2 = playTable.getHigh(s);
                zahl = temp2.getNumber();
                if (zahl == 11) {
                    temp.get(count).put(s, null);
                } else {
                    temp.get(count).put(s, zahl);
                }
                count++;

            }
        }
        return temp;
    }

    public HashMap<Integer, HashMap<String, Integer>> getHand() {
        HashMap<Integer, HashMap<String, Integer>> temp = new HashMap<Integer, HashMap<String, Integer>>();
        ArrayList<ICard> array = deck.getCards();
        for (int i = 0; i < array.size(); i++) {
            temp.put(i, new HashMap<String, Integer>());
            temp.get(i).put(array.get(i).getColour(), array.get(i).getNumber());
        }
        return temp;
    }

}
