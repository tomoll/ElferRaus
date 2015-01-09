package de.htwg.elferraus.entities;

public interface IMainStack {

    public int getAmount();

    public ICard popCard();

    public void mixCards();

}
