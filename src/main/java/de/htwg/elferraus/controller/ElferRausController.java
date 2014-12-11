package de.htwg.elferraus.controller;

import de.htwg.elferraus.entities.*;
import de.htwg.util.observer.Observable;


public class ElferRausController extends Observable {
   
    //Anzahl Spieler 
    //Rundenfunktion, steuert wer gerade dran ist gibt bescheid für nächsten Spieler
    //leitet Ausgabe ein?
    //teilt Karten am Anfang vom Spiel aus 
    
    private String statusMessage = "Welcome to ElferRaus";
    private int playerAmount;
    private Player[] player;
    public MainArray playTable;
    public MainStack stack;
    public boolean endRoundAllowed = false;
    private int actualplayer = 1;
    
    public ElferRausController(int players, MainArray playTable, MainStack stack){
        this.playerAmount = players;
        this.playTable = playTable;
        this.stack = stack;
        player = new Player[playerAmount];
        player[1]=new Player();
    }

    public Player nextPlayer(int i){
        return player[i+1];
    }

    public void setEndRound() {
        if(endRoundAllowed){
            //next Player aufrufen und Statuswechsel!
        } else{
            setStatusMessage("Player not allowed to finish his turn!");
            notifyObservers();
        }
    }

    public void setCardRequest(int next) {
        
        boolean valid = false;
        Card chosen = player[actualplayer].deck.indexToCard(next);
        Card setCard = player[actualplayer].deck.popplCard(chosen);
        if(setCard!=null){
            valid = player[actualplayer].setCard(setCard, setCard.getColour());
            if(valid){
                endRoundAllowed = true;
                setStatusMessage("Card: " + setCard.getColour() + setCard.getNumber() + " succesfully placed!");
                notifyObservers();
            }
            else {
                setStatusMessage("Card does not match to any colourarray!");
                notifyObservers();
            }
        } else {
            setStatusMessage("The card you've chosen is not available!");
            notifyObservers();
        }
    }
    public void getCardRequest() {
        if (stack.getAmount() > 0 &&  player[actualplayer].stackCards < 3){
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
        
        return playTable.toString();
    }
    private void setStatusMessage(String statusMessage){
        this.statusMessage = statusMessage;
    }
    
}
