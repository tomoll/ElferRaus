package de.htwg.elferraus.entities;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */

public class MainStack {
    private Card[] startstack = new Card[80];
    //kein Array sondern Stack
    //am besten eigenen Zähler wegen Array 0 quasi 1!!!
    public MainStack() {
        for(int i = 0; i<4; i++){
            //doppelte Schleife um alle Karten zu erstellen und sortiert in Stapel rein 
            
        }
    }
    
    public int getAmount(){
        return 88;
    }
    
    public Card popCard(){
        
        return startstack[79];
    }


}
