package de.htwg.elferraus.controller;

/**
 *
 * @author Tobi
 */
public interface IElferRausController {

    /**
     *
     * @return
     */
    boolean next();

    /**
     *
     * @return
     */
    boolean setEndRound();

    /**
     *
     * @param next
     * @return
     */
    boolean setCardRequest(int next);

    /**
     *
     * @return
     */
    boolean getCardRequest();

    /**
     *
     * @return
     */
    String getMainString();

    /**
     *
     * @return
     */
    String getStatusMessage();
}
