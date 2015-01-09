package de.htwg.elferraus.entities;

/**
 *
 * @author Tobi
 */
public interface IPlayerDeck {

    /**
     *
     * @return
     */
    int getSize();

    /**
     *
     * @param i
     * @return
     */
    ICard indexToCard(int i);

    /**
     *
     * @param c
     * @return
     */
    ICard popplCard(ICard c);

    /**
     *
     * @param c
     */
    void addCard(ICard c);

}
