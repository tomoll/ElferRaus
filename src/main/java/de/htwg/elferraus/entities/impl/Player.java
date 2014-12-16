package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.IPlayer;
import de.htwg.elferraus.entities.impl.Card;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;

/**
 *
 * @author Christian
 */
public class Player implements IPlayer {
    public static MainArray playTable;
    public static MainStack stack;
    
    public PlayerDeck deck;
    
    private Card thisCard;
    private boolean valid = false;
    public int stackCards=0;
    

    public Player(MainArray playTable, MainStack stack) {
        this.stack = stack;                             //???
        this.playTable = playTable;                               //weiß ned ob des so einfach mit dem static langt 
        deck = new PlayerDeck();
    }
    
    public boolean setCard(Card chosenCard, String colour){
        valid = false;
        String thisColour = chosenCard.getColour();
        int thisNumber = chosenCard.getNumber();
        if(thisColour.equals(colour)) {
            if (thisNumber == 11) {
                this.playTable.setEleven(chosenCard);
                valid = true;
            } else if ((thisNumber + 1) == playTable.getLow(thisColour).getNumber()) {
                playTable.setLow(chosenCard);
                valid = true;
            } else if ((thisNumber - 1) == playTable.getHigh(thisColour).getNumber()) {
                playTable.setHigh(chosenCard);
                valid = true;
            } else {
                valid = false;
            }
        } 
        return valid;
    }
    
    public boolean getCard() {
        
        if (stack.getAmount() > 0 &&  stackCards < 3 && !valid) {
            deck.addCard(stack.popCard());
            stackCards++;                           //müssen des irgendwo wieder zurück setzen!!!!
            return true;

        } else if (stackCards == 3 || valid){
            return false;
        }
        return false;
    }
    
    
    
}
