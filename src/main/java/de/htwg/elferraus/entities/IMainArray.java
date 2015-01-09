package de.htwg.elferraus.entities;

public interface IMainArray {

    public void setHigh(ICard c);

    public void setLow(ICard c);

    public ICard getHigh(String colour);

    public ICard getLow(String colour);

    public void setEleven(ICard eleven);
    
    public boolean isNotEmpty(String colour);
    

}
