package de.htwg.elferraus.controller.impl;

import de.htwg.elferraus.entities.impl.Player;
import de.htwg.elferraus.entities.impl.MainStack;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.Card;
import de.htwg.elferraus.controller.*;
import de.htwg.elferraus.entities.impl.*;
import de.htwg.util.observer.Observable;

public class ElferRausController extends Observable implements IElferRausController {

    private String statusMessage = "Welcome to ElferRaus\n";
    private String playerMessage;
    public int playerAmount;
    private int playerStartDeck;
    public Player[] player;
    public boolean endRoundAllowed = false;
    private int actualplayer = 0;

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
        if (this.player[actualplayer].deck.getSize() > 0) {
            actualplayer = player[actualplayer].currentstate.next(player[actualplayer], actualplayer, playerAmount);
            actualplayer = player[actualplayer].currentstate.next(player[actualplayer], actualplayer, playerAmount);
            return true;
        }
        return false;
        // Hier muss jetzt noch Gewonnen/Verloren rein
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

    public boolean setCardRequest(int next) {

        boolean valid;

        if (next <= player[actualplayer].deck.getSize()) {
            Card chosen = player[actualplayer].deck.indexToCard(next);
            Card setCard = player[actualplayer].deck.popplCard(chosen);
            valid = player[actualplayer].setCard(setCard);
            if (valid) {
                endRoundAllowed = true;
                setStatusMessage("Card: " + setCard.getColour() + setCard.getNumber() + " succesfully placed!\n");
                notifyObservers();
                return true;
            } else {
                setStatusMessage("Card does not match to any colourarray!\n");
                player[actualplayer].deck.addCard(setCard);
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
        if (player[actualplayer].stack.getAmount() > 0 && player[actualplayer].stackCards < 3 && !endRoundAllowed) {
            player[actualplayer].getCard();
            setStatusMessage("Succesfully received a new card from the stack!\n");
            notifyObservers();
            return true;
        } else if (player[actualplayer].stackCards >= 3) {
            endRoundAllowed = true;
            return false;
        } else {
            setStatusMessage("Can't pop card from the stack!\n");
            notifyObservers();
            return false;
        }

    }

    public String currentPlayerString() {
        return player[actualplayer].deck.toString();
    }

    public String getMainString() {

        playerMessage = player[actualplayer].playTable.toString() + "\n";
        playerMessage = playerMessage + "------------------------------" + "\n";
        playerMessage = playerMessage + this.currentPlayerString() + "\n";
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
        if (playerAmount <= 3) {
            playerStartDeck = 20;
        }
        if (playerAmount == 4) {
            playerStartDeck = 15;
        }
        if (playerAmount == 5) {
            playerStartDeck = 12;
        }
        if (playerAmount == 6) {
            playerStartDeck = 10;
        }

        for (int i = 0; i < playerStartDeck; i++) {
            for (int j = 0; j < playerAmount; j++) {
                player[j].deck.addCard(player[actualplayer].stack.popCard());
            }
        }
    }
    

}
