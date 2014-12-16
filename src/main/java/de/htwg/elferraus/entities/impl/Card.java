package de.htwg.elferraus.entities.impl;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class Card {
    private final int number;
    private final String colour;
    
    public Card(int i, String s){
        this.number = i;
        this.colour = s;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public String getColour(){
        return this.colour;
    }
}
