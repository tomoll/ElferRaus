/*
 * mainLists is the playground where you lay down the right cards
 *
 * 
 *
*/
package de.htwg.elferraus.entities;

import java.util.LinkedList;


/**
 *
 * @author Christian Hümmer, Tobias Moll
 */

public class MainArray {
    final private LinkedList<Card>[] array;
    

    public MainArray() {
        // 1 = 'b'lue
        // 2 = 'g'reen
        // 3 = 'r'ed
        // 4 = 'y'ellow
        array = new LinkedList[4];
        
        //Array mit 4 LinkedLists 
    }
    
    public void setHigh(Card c){
        //Liste oberhalb anlegen
        int i = colourStrToInt(c.getColour());
        array[i].addLast(c);
    }
    
    public void setLow(Card c){
        //Liste unterhalb anlegen
        int i = colourStrToInt(c.getColour());
        array[i].addFirst(c);
    }
    
    public Card getHigh(String colour){
        //höchste Karte von der Farbe zurück geben
        int i = colourStrToInt(colour);
        return array[i].getLast();
    }
    
    public Card getLow(String colour){
        //niedrigste Karte von der Farbe zurück geben
        int i = colourStrToInt(colour);
        return array[i].getFirst();
    }
    
    public void setEleven(Card eleven){
        int i = colourStrToInt(eleven.getColour());
        array[i] = new LinkedList<Card>();
        array[i].addFirst(eleven);
    }
    
    private int colourStrToInt(String colour){
        int colourcode;
        if(colour.equals("b")){
            colourcode = 1;
        } if(colour.equals("g")){
            colourcode = 2;
        } if(colour.equals("r")){
            colourcode = 3;
        } if(colour.equals("y")){
            colourcode = 4;
        } else {
            colourcode = 0;
        }
        return colourcode;
    }
   
    public String toString(){
        //returns a String with the Cards on top and bottom of all Colours which 
        //lay on the table 
        return "noch machen";
    }

}
