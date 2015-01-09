package de.htwg.elferraus.entities;

public interface IPlayer {

    public boolean setCard(ICard chosenCard);

    public boolean getCard();

    public boolean setState(IStates s);
}
