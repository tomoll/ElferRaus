package de.htwg.elferraus.entities;

public interface IPlayer {

    boolean setCard(ICard chosenCard);

    boolean getCard();

    boolean setState(IStates s);
}
