package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.ICard;
import de.htwg.elferraus.entities.IStates;
import de.htwg.elferraus.entities.IPlayer;

public class Player implements IPlayer {

    private static MainArray playTable;
    private static MainStack stack;
    private PlayerDeck deck;
    private IStates currentstate;
    private int pulledCards = 0;
    private final int eleven = 11;

    public Player(MainArray playTable, MainStack stack) {
        this.stack = stack;
        this.playTable = playTable;
        deck = new PlayerDeck();
    }

    public boolean setCard(ICard chosenCard) {
        boolean valid = false;
        String chosenColour = chosenCard.getColour();
        int chosenNumber = chosenCard.getNumber();
        if (chosenNumber == eleven) {
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

    public boolean getCard() {
        deck.addCard(stack.popCard());
        pulledCards++;
        return true;
    }

    public boolean setState(IStates s) {
        currentstate = s;
        pulledCards = 0;
        return true;
    }
    public int nextState(IPlayer player, int index, int amount){
        return currentstate.next(this, index, amount);
    }
    
    public int cardsOnHand(){
        return deck.getSize();
    }
    
    public ICard cardToIndex(int index){
        return deck.popplCard(deck.indexToCard(index));
    }
    
    public boolean addCardtoHand(ICard c){
        deck.addCard(c);
        return true;
    }
    
    public int pulledCards(){
        return pulledCards;
    }
    
    public int stackSize(){
        return stack.getAmount();
    }
    
    public String printDeck(){
        return deck.toString();
    }
    
    public String printTable(){
        return playTable.toString();
    }
    
    public ICard takeCard(){
        return stack.popCard();        
    }

}
