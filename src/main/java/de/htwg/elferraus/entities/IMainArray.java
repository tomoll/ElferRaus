package de.htwg.elferraus.entities;

/**
 *
 * @author Tobi
 */
public interface IMainArray {

    /**
     *
     * @param c
     */
    void setHigh(ICard c);

    /**
     *
     * @param c
     */
    void setLow(ICard c);

    /**
     *
     * @param colour
     * @return
     */
    ICard getHigh(String colour);

    /**
     *
     * @param colour
     * @return
     */
    ICard getLow(String colour);

    /**
     *
     * @param eleven
     */
    void setEleven(ICard eleven);

    /**
     *
     * @param colour
     * @return
     */
    boolean isNotEmpty(String colour);

}
