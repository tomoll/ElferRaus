package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.ICard;
import de.htwg.elferraus.entities.IStates;
import de.htwg.elferraus.entities.IPlayer;

public class Player implements IPlayer {

    public static MainArray playTable;
    public static MainStack stack;
    public PlayerDeck deck;
    public IStates currentstate;
    private boolean valid = false;
    public int stackCards = 0;

    public Player(MainArray playTable, MainStack stack) {
        this.stack = stack;
        this.playTable = playTable;
        deck = new PlayerDeck();
    }

    public boolean setCard(ICard chosenCard) {
        valid = false;
        String chosenColour = chosenCard.getColour();
        int chosenNumber = chosenCard.getNumber();
        if (chosenNumber == 11) {
            this.playTable.setEleven(chosenCard);
            valid = true;
        }
        if (playTable.isNotEmpty(chosenColour)) {
            if ((chosenNumber + 1) == playTable.getLow(chosenColour).getNumber()) {
                playTable.setLow(chosenCard);
                valid = true;
            }
        }
        if (playTable.isNotEmpty(chosenColour)) {
            if ((chosenNumber - 1) == playTable.getHigh(chosenColour).getNumber()) {
                playTable.setHigh(chosenCard);
                valid = true;
            }
        }
        return valid;
    }

    public boolean getCard() {
        deck.addCard(stack.popCard());
        stackCards++;
        return true;
    }

    public boolean setState(IStates s) {
        currentstate = s;
        stackCards = 0;
        return true;
    }

}
