package de.htwg.elferraus.entities;

/**
 *
 * @author Tobi
 */
public interface IPlayer {

    /**
     *
     * @param chosenCard
     * @return
     */
    boolean setCard(ICard chosenCard);

    /**
     *
     * @return
     */
    boolean getCard();

    /**
     *
     * @param s
     * @return
     */
    boolean setState(IStates s);
}
