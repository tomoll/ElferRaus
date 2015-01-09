package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.ICard;
import de.htwg.elferraus.entities.IStates;
import de.htwg.elferraus.entities.IPlayer;

/**
 *
 * @author Tobi
 */
public class Player implements IPlayer {

    private static MainArray playTable;
    private static MainStack stack;
    private PlayerDeck deck;
    private IStates currentstate;
    private int pulledCards = 0;
    private static final int ELEVEN = 11;

    /**
     *
     * @param playTable
     * @param stack
     */
    public Player(MainArray playTable, MainStack stack) {
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
    public int nextState(IPlayer player, int index, int amount){
        return currentstate.next(this, index, amount);
    }
    
    /**
     *
     * @return
     */
    public int cardsOnHand(){
        return deck.getSize();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public ICard cardToIndex(int index){
        return deck.popplCard(deck.indexToCard(index));
    }
    
    /**
     *
     * @param c
     * @return
     */
    public boolean addCardtoHand(ICard c){
        deck.addCard(c);
        return true;
    }
    
    /**
     *
     * @return
     */
    public int pulledCards(){
        return pulledCards;
    }
    
    /**
     *
     * @return
     */
    public int stackSize(){
        return stack.getAmount();
    }
    
    /**
     *
     * @return
     */
    public String printDeck(){
        return deck.toString();
    }
    
    /**
     *
     * @return
     */
    public String printTable(){
        return playTable.toString();
    }
    
    /**
     *
     * @return
     */
    public ICard takeCard(){
        return stack.popCard();        
    }

}
