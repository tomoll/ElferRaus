package de.htwg.elferraus.entities;

import de.htwg.elferraus.entities.impl.Card;

public interface IPlayerDeck {

    public int getSize();

    public Card indexToCard(int i);

    public Card popplCard(Card c);

    public void addCard(Card c);

}
