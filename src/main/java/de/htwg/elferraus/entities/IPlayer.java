package de.htwg.elferraus.entities;

import de.htwg.elferraus.entities.impl.Card;

public interface IPlayer {

    public boolean setCard(Card chosenCard);

    public boolean getCard();

    public boolean setState(IStates s);
}
