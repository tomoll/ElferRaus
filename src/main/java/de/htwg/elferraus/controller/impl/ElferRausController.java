package de.htwg.elferraus.controller.impl;
import de.htwg.elferraus.entities.impl.Player;
import de.htwg.elferraus.entities.impl.MainStack;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.Card;
import de.htwg.elferraus.controller.*;

import de.htwg.util.observer.Observable;

public class ElferRausController extends Observable implements IElferRausController {

    private String statusMessage = "Welcome to ElferRaus";
    public int playerAmount;
    private int playerStartDeck;
    public Player[] player;
    public boolean endRoundAllowed = false;
    private int actualplayer = 0;

    public ElferRausController(int players, MainArray playTable, MainStack stack) {
        this.playerAmount = players;
        player = new Player[playerAmount];
        for(int i = 0; i<playerAmount;i++){
            player[i] = new Player(playTable, stack);
        }
        giveCards();
    }

    public Player nextPlayer(int i) {       //weiß ned für was gedacht??? 
        return player[i + 1];
    }

    public void next(){
        actualplayer = player[actualplayer].currentstate.next(this, actualplayer, playerAmount);
    }
    
   
    
    
    public boolean setEndRound() {
        if (endRoundAllowed) {
            next();
            return true;
        } else {
            setStatusMessage("Player not allowed to finish his turn!");
            notifyObservers();
            return false;
        }
    }

    public boolean setCardRequest(int next) {

        boolean valid = false;
        Card chosen = player[actualplayer].deck.indexToCard(next);
        Card setCard = player[actualplayer].deck.popplCard(chosen);
        if (setCard != null) {
            valid = player[actualplayer].setCard(setCard);
            if (valid) {
                endRoundAllowed = true;
                setStatusMessage("Card: " + setCard.getColour() + setCard.getNumber() + " succesfully placed!");
                notifyObservers();
                return true;
            } else {
                setStatusMessage("Card does not match to any colourarray!");
                player[actualplayer].deck.addCard(setCard);
                notifyObservers();
                return false;
            }
        } else {
            setStatusMessage("The card you've chosen is not available!");
            notifyObservers();
            return false;
        }
    }

    public void getCardRequest() {
        if (player[actualplayer].stack.getAmount() > 0 && player[actualplayer].stackCards < 3) {
            player[actualplayer].getCard();
            setStatusMessage("Succesfully received a new card from the stack!");
            notifyObservers();
        } else {
            setStatusMessage("Can't pop card from the stack!");
            notifyObservers();
        }

    }

    public String currentPlayerString() {
        return player[actualplayer].deck.toString();
    }

    public String getMainString() {

        statusMessage = player[actualplayer].playTable.toString() + "\n";
        statusMessage = statusMessage + "------------------------------" + "\n";
        statusMessage = statusMessage + this.currentPlayerString() + "\n";
        statusMessage = statusMessage + "------------------------------"+ "\n";
        statusMessage = statusMessage + "Please enter a command:" + "\n";
        statusMessage = statusMessage + "------------------------------" + "\n";
        statusMessage = statusMessage + "1. Get new card from Stack" + "\n";
        statusMessage = statusMessage + "2. Lay down card at Index" + "\n";
        statusMessage = statusMessage + "3. End Round" + "\n";
        //statusMessage = statusMessage + "4. Update cards" + "\n";
        statusMessage = statusMessage + "4. Quit Game" + "\n";
        
        return statusMessage; 
        
        
    }

    private void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
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
