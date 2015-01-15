package de.htwg.elferraus.controller.impl;

import com.google.inject.Injector;
import de.htwg.elferraus.entities.impl.Player;
import de.htwg.elferraus.controller.*;
import de.htwg.elferraus.entities.*;
import de.htwg.elferraus.entities.impl.Playing;
import de.htwg.elferraus.entities.impl.Waiting;
import de.htwg.util.observer.impl.Observable;

/**
 *
 * @author Tobi
 */
public class ElferRausController extends Observable implements IElferRausController {

    private String statusMessage;
    private int playerAmount;
    private int playerStartDeck;
    private Player[] player;
    private boolean endRoundAllowed = false;
    private int actualplayer = 0;
    private static final int POPMAX = 3;
    private static final int PLAYER3 = 3;
    private static final int PLAYER4 = 4;
    private static final int PLAYER5 = 5;
    private static final int PLAYER6 = 6;
    private static final int CARDSFORTHREE = 20;
    private static final int CARDSFORFOUR = 15;
    private static final int CARDSFORFIVE = 12;
    private static final int CARDSFORSIX = 10;
      /**
     * Set up Google Guice Dependency Injector. Build up the application,
     * resolving dependencies automatically by Guice
     */
    private Injector injector;
    
    /**
     *  Create Method the Startsequence for the Player
     */
    public void create(){
        statusMessage = "Welcome to ElferRaus\n";
    }

    /**
     *
     */
    public void startGame(){
        setStatusMessage("Welcome Player 1\n");
        IMainArray playTable = injector.getInstance(IMainArray.class);
        IMainStack stack = injector.getInstance(IMainStack.class);
        player = new Player[playerAmount];
        for (int i = 0; i < playerAmount; i++) {
            
            player[i] = new Player(playTable, stack);
            player[i].setState(new Waiting());
        }
        giveCards();
        player[actualplayer].setState(new Playing());
        notifyObservers();
  
        
    }
    
    

    /**
     *
     * @return
     */
    public boolean next() {
        if (this.player[actualplayer].cardsOnHand()>0) {
            actualplayer = player[actualplayer].nextState(player[actualplayer], actualplayer, playerAmount);
            actualplayer = player[actualplayer].nextState(player[actualplayer], actualplayer, playerAmount);
            setStatusMessage("Now Player "+(actualplayer+1)+"\n");
            return true;
        }
        setStatusMessage("WUHUUU You are the Winner!!!!! \nGame Over");
        return false;
    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @param index
     * @return
     */
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

    /**
     *
     * @return
     */
    public boolean getCardRequest() {
        if (player[actualplayer].stackSize()> 0 && player[actualplayer].pulledCards() < POPMAX && !endRoundAllowed) {
            player[actualplayer].getCard();
            if(player[actualplayer].pulledCards() == POPMAX){
                endRoundAllowed = true;
            }
            setStatusMessage("Succesfully received a new card from the stack!\n");
            notifyObservers();
            return true;
        } else if (player[actualplayer].pulledCards() >= POPMAX) {
            setStatusMessage("Already allowed to End Round!\n");
            notifyObservers();
            return false;
        } else {
            setStatusMessage("Can't pop card from the stack!\n");
            notifyObservers();
            return false;
        }

    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @param statusMessage
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     *
     * @return
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    private void giveCards() {
        if (playerAmount <= PLAYER3) {
            playerStartDeck = CARDSFORTHREE;
        }
        if (playerAmount == PLAYER4) {
            playerStartDeck = CARDSFORFOUR;
        }
        if (playerAmount == PLAYER5) {
            playerStartDeck = CARDSFORFIVE;
        }
        if (playerAmount == PLAYER6) {
            playerStartDeck = CARDSFORSIX;
        }

        for (int i = 0; i < playerStartDeck; i++) {
            for (int j = 0; j < playerAmount; j++) {
                player[j].addCardtoHand(player[actualplayer].takeCard());
            }
        }
    }
    
    /**
     *
     * @return
     */
    public Player getActualPlayer(){
        return player[actualplayer];
    }

    /**
     *
     * @return
     */
    public int getIntPlayer(){
        return actualplayer;
    }
    
    /**
     *
     * @param playerAmount
     */
    public void setPlayer(int playerAmount){
        this.playerAmount=playerAmount;
        startGame();
        notifyObservers();
        
    }
    
    /**
     *
     * @param injector
     */
    public void setInjector(Injector injector){
        this.injector = injector;
    }
 
}
