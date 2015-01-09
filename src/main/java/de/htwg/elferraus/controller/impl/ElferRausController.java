package de.htwg.elferraus.controller.impl;

import de.htwg.elferraus.entities.impl.Player;
import de.htwg.elferraus.entities.impl.MainStack;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.controller.*;
import de.htwg.elferraus.entities.ICard;
import de.htwg.elferraus.entities.impl.*;
import de.htwg.util.observer.Observable;

public class ElferRausController extends Observable implements IElferRausController {

    private String statusMessage = "Welcome to ElferRaus\n";
    private int playerAmount;
    private int playerStartDeck;
    private Player[] player;
    private boolean endRoundAllowed = false;
    private int actualplayer = 0;
    private final int popMax = 3;
    private final int player3 = 3;
    private final int player4 = 4;
    private final int player5 = 5;
    private final int player6 = 6;
    private final int cardsForThree = 20;
    private final int cardsForFour = 15;
    private final int cardsForFive = 12;
    private final int cardsForSix = 10;
    

    public ElferRausController(int players, MainArray playTable, MainStack stack) {
        this.playerAmount = players;
        player = new Player[playerAmount];
        for (int i = 0; i < playerAmount; i++) {
            player[i] = new Player(playTable, stack);
            player[i].setState(new Waiting());
        }
        giveCards();
        player[actualplayer].setState(new Playing());
    }

    public boolean next() {
        if (this.player[actualplayer].cardsOnHand()>0) {
            actualplayer = player[actualplayer].nextState(player[actualplayer], actualplayer, playerAmount);
            actualplayer = player[actualplayer].nextState(player[actualplayer], actualplayer, playerAmount);
            return true;
        }
        return false;
    }

    public boolean setEndRound() {
        if (endRoundAllowed) {
            next();
            endRoundAllowed = false;
            notifyObservers();
            return true;
        } else {
            setStatusMessage("Player not allowed to finish his turn!\n");
            notifyObservers();
            return false;
        }
    }

    public boolean setCardRequest(int index) {
        boolean valid;
        if (index <= player[actualplayer].cardsOnHand()) {
            ICard setCard = player[actualplayer].cardToIndex(index);
            valid = player[actualplayer].setCard(setCard);
            if (valid) {
                endRoundAllowed = true;
                setStatusMessage("Card: " + setCard.getColour() + setCard.getNumber() + " succesfully placed!\n");
                notifyObservers();
                return true;
            } else {
                setStatusMessage("Card does not match to any colourarray!\n");
                player[actualplayer].addCardtoHand(setCard);
                notifyObservers();
                return false;
            }
        } else {
            setStatusMessage("The card you've chosen is not available!\n");
            notifyObservers();
            return false;
        }
    }

    public boolean getCardRequest() {
        if (player[actualplayer].stackSize()> 0 && player[actualplayer].pulledCards() < popMax && !endRoundAllowed) {
            player[actualplayer].getCard();
            setStatusMessage("Succesfully received a new card from the stack!\n");
            notifyObservers();
            return true;
        } else if (player[actualplayer].pulledCards() >= popMax) {
            endRoundAllowed = true;
            return false;
        } else {
            setStatusMessage("Can't pop card from the stack!\n");
            notifyObservers();
            return false;
        }

    }

    public String getMainString() {

        String playerMessage;
        playerMessage = player[actualplayer].printTable() + "\n";
        playerMessage = playerMessage + "------------------------------" + "\n";
        playerMessage = playerMessage + player[actualplayer].printDeck() + "\n";
        playerMessage = playerMessage + "------------------------------" + "\n";
        playerMessage = playerMessage + "Please enter a command:" + "\n";
        playerMessage = playerMessage + "------------------------------" + "\n";
        playerMessage = playerMessage + "1. Get new card from Stack" + "\n";
        playerMessage = playerMessage + "2. Lay down card at Index" + "\n";
        playerMessage = playerMessage + "3. End Round" + "\n";
        playerMessage = playerMessage + "4. Quit Game" + "\n";

        return playerMessage;

    }

    private void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    private void giveCards() {
        if (playerAmount <= player3) {
            playerStartDeck = cardsForThree;
        }
        if (playerAmount == player4) {
            playerStartDeck = cardsForFour;
        }
        if (playerAmount == player5) {
            playerStartDeck = cardsForFive;
        }
        if (playerAmount == player6) {
            playerStartDeck = cardsForSix;
        }

        for (int i = 0; i < playerStartDeck; i++) {
            for (int j = 0; j < playerAmount; j++) {
                player[j].addCardtoHand(player[actualplayer].takeCard());
            }
        }
    }
    
    public Player getActualPlayer(){
        return player[actualplayer];
    }
 
}
