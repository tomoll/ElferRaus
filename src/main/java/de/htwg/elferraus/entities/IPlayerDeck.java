package de.htwg.elferraus.entities;

public interface IPlayerDeck {

    public int getSize();

    public ICard indexToCard(int i);

    public ICard popplCard(ICard c);

    public void addCard(ICard c);

}
