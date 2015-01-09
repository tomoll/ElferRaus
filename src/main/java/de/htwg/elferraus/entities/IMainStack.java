package de.htwg.elferraus.entities;

import de.htwg.elferraus.entities.impl.Card;

public interface IMainStack {

    public int getAmount();

    public Card popCard();

    public void mixCards();

}
