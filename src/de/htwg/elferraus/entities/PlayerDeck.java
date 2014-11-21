package de.htwg.elferraus.entities;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */

public class PlayerDeck {
    private int size;
    Card [] deck = new Card[size];
    
    public PlayerDeck(int size) {
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
   
    public Card popplCard(int i){
        Card c = new Card(2,"y");
        return c;
     
    }
    public void addCard(Card c){ 
    }
}

