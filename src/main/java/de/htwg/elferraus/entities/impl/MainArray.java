/*
 * mainLists is the playground where you lay down the right cards
 *
 * 
 *
 */
package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.IMainArray;
import de.htwg.elferraus.entities.impl.Card;
import java.util.LinkedList;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 * bla bla
 */
public class MainArray implements IMainArray {

    final private LinkedList<Card>[] array;
    final private int anzColour = 5;

    public MainArray() {
        // 1 = 'b'lue
        // 2 = 'g'reen
        // 3 = 'r'ed
        // 4 = 'y'ellow
        array = new LinkedList[anzColour];
//        for(int i = 0; i < anzColour; i++){
//             array[i] = new LinkedList<Card>();
//        }
        //Array mit 4 LinkedLists 
    }

    public void setHigh(Card c) {
        //Liste oberhalb anlegen
        int i = colourStrToInt(c.getColour());
        array[i].addLast(c);
    }

    public void setLow(Card c) {
        //Liste unterhalb anlegen
        int i = colourStrToInt(c.getColour());
        array[i].addFirst(c);
    }

    public Card getHigh(String colour) {
        //höchste Karte von der Farbe zurück geben
        int i = colourStrToInt(colour);
        return array[i].getLast();
    }

    public Card getLow(String colour) {
        //niedrigste Karte von der Farbe zurück geben
        int i = colourStrToInt(colour);
        return array[i].getFirst();
    }

    public void setEleven(Card eleven) {
        int i = colourStrToInt(eleven.getColour());
        array[i] = new LinkedList<Card>();
        array[i].addFirst(eleven);
    }

    private int colourStrToInt(String colour) {
        int colourcode;
        if (colour.equals("b")) {
            colourcode = 1;
        }
        if (colour.equals("g")) {
            colourcode = 2;
        }
        if (colour.equals("r")) {
            colourcode = 3;
        }
        if (colour.equals("y")) {
            colourcode = 4;
        } else {
            colourcode = 0;
        }
        return colourcode;
    }

    @Override
    public String toString() {
        //returns a String with the Cards on top and bottom of all Colours which 
        //lay on the table 
        String s;
        s = "Blau:" + this.getLow("b") + "\t 11 \t" + this.getHigh("b") + "\n";
        s = s + "Gruen:" + this.getLow("g") + "\t 11 \t" + this.getHigh("g") + "\n";
        s = s + "Rot:" + this.getLow("r") + "\t 11 \t" + this.getHigh("r") + "\n";
        s = s + "Gelb:" + this.getLow("y") + "\t 11 \t" + this.getHigh("y") + "\n";
        return s;

    }

}
