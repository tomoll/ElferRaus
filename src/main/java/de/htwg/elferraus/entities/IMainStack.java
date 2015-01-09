package de.htwg.elferraus.entities;

/**
 *
 * @author Tobi
 */
public interface IMainStack {

    /**
     *
     * @return
     */
    int getAmount();

    /**
     *
     * @return
     */
    ICard popCard();

}
