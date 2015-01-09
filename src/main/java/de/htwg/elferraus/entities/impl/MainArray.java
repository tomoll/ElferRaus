package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.ICard;
import de.htwg.elferraus.entities.IMainArray;
import java.util.Deque;
import java.util.LinkedList;

public class MainArray implements IMainArray {

    private final Deque<ICard>[] array;
    private final static int anzColour = 4;
    private final int three = 3;
    private final int eleven = 11;

    public MainArray() {
        // 0 = 'b'lue
        // 1 = 'g'reen
        // 2 = 'r'ed
        // 3 = 'y'ellow
        array = new LinkedList[anzColour];
        for (int i = 0; i < anzColour; i++) {
            array[i] = new LinkedList<ICard>();
        }

    }

    public void setHigh(ICard c) {
        int i = colourStrToInt(c.getColour());
        array[i].addLast(c);
    }

    public void setLow(ICard c) {
        int i = colourStrToInt(c.getColour());
        array[i].addFirst(c);
    }

    public ICard getHigh(String colour) {
        int i = colourStrToInt(colour);
        return array[i].getLast();
    }

    public ICard getLow(String colour) {
        int i = colourStrToInt(colour);
        return array[i].getFirst();
    }

    public void setEleven(ICard eleven) {
        int i = colourStrToInt(eleven.getColour());
        array[i].addFirst(eleven);
    }

    public boolean isNotEmpty(String colour) {
        return array[colourStrToInt(colour)].size() > 0;
    }

    private int colourStrToInt(String colour) {
        int colourcode = 0;
        if (colour.equals("b")) {
            colourcode = 0;
        }
        if (colour.equals("g")) {
            colourcode = 1;
        }
        if (colour.equals("r")) {
            colourcode = 2;
        }
        if (colour.equals("y")) {
            colourcode = three;
        }
        return colourcode;
    }

    @Override
    public String toString() {
        String s = "";
        String colour = "";
        for (int i = 0; i < anzColour; i++) {
            if (i == 0) {
                s = s + "blue:    \t";
                colour = "b";
            }
            if (i == 1) {
                s = s + "green:    \t";
                colour = "g";
            }
            if (i == 2) {
                s = s + "red:    \t";
                colour = "r";
            }
            if (i == three) {
                s = s + "yellow: \t";
                colour = "y";
            }

            if (array[i].size() > 0) {
                if (this.getLow(colour).getNumber() != eleven) {
                    s = s + this.getLow(colour).getNumber() + "\t 11 \t";
                } else {
                    s = s + "no Card" + "\t 11 \t";
                }
                if (this.getHigh(colour).getNumber() != eleven) {
                    s = s + this.getHigh(colour).getNumber() + "\n";
                } else {
                    s = s + "no Card" + "\n";
                }
            } else {
                s = s + "no eleven!\n";
            }

        }

        return s;

    }

}
