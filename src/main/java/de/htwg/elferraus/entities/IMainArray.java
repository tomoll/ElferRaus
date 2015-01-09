package de.htwg.elferraus.entities;

import de.htwg.elferraus.entities.impl.Card;

public interface IMainArray {

    public void setHigh(Card c);

    public void setLow(Card c);

    public Card getHigh(String colour);

    public Card getLow(String colour);

    public void setEleven(Card eleven);
    
    public boolean isNotEmpty(String colour);
    

}
