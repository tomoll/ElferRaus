package de.htwg.elferraus.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */

public class PlayerDeck {
    
    List<Card> playerDeck = new ArrayList<Card>(80);
  
    public int getSize(){
        return playerDeck.size();
    }
   
    public Card indexToCard(int i){
        return playerDeck.get(i);
    }
    public Card popplCard(Card c){
        if(playerDeck.remove(c)){
            return c;
        }else{
            return null;
        }
    }
    public void addCard(Card c){
        playerDeck.add(c);
    }
}

