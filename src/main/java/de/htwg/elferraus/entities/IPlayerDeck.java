package de.htwg.elferraus.entities;

public interface IPlayerDeck {

    int getSize();

    ICard indexToCard(int i);

    ICard popplCard(ICard c);

    void addCard(ICard c);

}
