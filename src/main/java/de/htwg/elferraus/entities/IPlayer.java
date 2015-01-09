package de.htwg.elferraus.entities;

import de.htwg.elferraus.entities.impl.Card;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;


public interface IPlayer {
    public boolean setCard(Card chosenCard);
    public boolean getCard();
 //   public int next(MainArray playTable, MainStack stack);
}
