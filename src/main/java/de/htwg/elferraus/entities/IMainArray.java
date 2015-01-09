package de.htwg.elferraus.entities;

public interface IMainArray {

    void setHigh(ICard c);

    void setLow(ICard c);

    ICard getHigh(String colour);

    ICard getLow(String colour);

    void setEleven(ICard eleven);

    boolean isNotEmpty(String colour);

}
