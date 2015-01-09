package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.*;

/**
 *
 * @author Tobi
 */
public class Card implements ICard {

    private final int number;
    private final String colour;

    /**
     *
     * @param i
     * @param s
     */
    public Card(int i, String s) {
        this.number = i;
        this.colour = s;
    }

    /**
     *
     * @return
     */
    public int getNumber() {
        return this.number;
    }

    /**
     *
     * @return
     */
    public String getColour() {
        return this.colour;
    }
}
