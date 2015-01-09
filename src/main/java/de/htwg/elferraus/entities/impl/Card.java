package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.*;

public class Card implements ICard {

    private final int number;
    private final String colour;

    public Card(int i, String s) {
        this.number = i;
        this.colour = s;
    }

    public int getNumber() {
        return this.number;
    }

    public String getColour() {
        return this.colour;
    }
}
