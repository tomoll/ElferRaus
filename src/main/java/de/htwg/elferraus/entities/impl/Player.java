package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.controller.IStates;
import de.htwg.elferraus.entities.IPlayer;

/**
 *
 * @author Christian
 */
public class Player implements IPlayer {
    public static MainArray playTable;
    public static MainStack stack;
    
    public PlayerDeck deck;
    public IStates currentstate;
    private Card thisCard;
    private boolean valid = false;
    public int stackCards=0;
    

    public Player(MainArray playTable, MainStack stack) {
        this.stack = stack;                             
        this.playTable = playTable;  
        deck = new PlayerDeck();
    }
    
    public boolean setCard(Card chosenCard){
        valid = false;                                      //muss über die states gemacht werden!!!!! sowie stackCards
        String chosenColour = chosenCard.getColour();
        int chosenNumber = chosenCard.getNumber();
            if (chosenNumber == 11) {
                this.playTable.setEleven(chosenCard);
                valid = true;
            } else if (playTable.isNotEmpty(chosenColour)) {
                if((chosenNumber + 1) == playTable.getLow(chosenColour).getNumber()){
                     playTable.setLow(chosenCard);
                valid = true;
                }
            } else if (playTable.isNotEmpty(chosenColour)) {
                if((chosenNumber - 1) == playTable.getHigh(chosenColour).getNumber()){
                    playTable.setHigh(chosenCard);
                    valid = true;
                }
            } else {
                valid = false;
            }
        return valid;
    }
    
    public boolean getCard() {
        
        if (stack.getAmount() > 0 &&  stackCards < 3 && !valid) {
            deck.addCard(stack.popCard());
            stackCards++;                           //müssen des irgendwo wieder zurück setzen!!!!
            return true;

        } else if (stackCards >= 3 || valid){
            return false;
        }
        return false;
    }
    
    
     public void setState(IStates s){
        currentstate = s;
        
    }
}
