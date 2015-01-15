package de.htwg.elferraus.entities;

/**
 * the deck for the Cards from the player
 * @author Tobi
 */
public interface IPlayerDeck {

    /**
     * how many cards at this players hand
     * @return
     */
    int getSize();

    /**
     * what is the card to this index
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
