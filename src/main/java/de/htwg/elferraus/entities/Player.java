/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.htwg.elferraus.entities;

/**
 *
 * @author Christian
 */
public class Player {
    private static MainArray main;
    public int stackCards=0;
    private static MainStack stack;
    public PlayerDeck deck;
    private Card thisCard;
    
    public boolean setCard(Card chosenCard, String colour){
        boolean valid = false;
        String thisColour = chosenCard.getColour();
        int thisNumber = chosenCard.getNumber();
        if(thisColour.equals(colour)) {
            if (thisNumber == 11) {
                main.setEleven(thisCard);
                valid = true;
            } else if ((thisNumber + 1) == main.getLow(thisColour).getNumber()) {
                main.setLow(thisCard);
                valid = true;
            } else if ((thisNumber - 1) == main.getHigh(thisColour).getNumber()) {
                main.setHigh(thisCard);
                valid = true;
            } else {
                valid = false;
            }
        } 
        return valid;
    }
    
    public void getCard() {
        
        if (stack.getAmount() > 0 &&  stackCards < 3) {
            deck.addCard(stack.popCard());
            stackCards++;

        } else if (stackCards == 3){
        }
    }
    
    
    
}
