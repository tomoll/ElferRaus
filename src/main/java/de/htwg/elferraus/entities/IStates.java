package de.htwg.elferraus.entities;

/**
 *
 * @author Tobi
 */
public interface IStates {

    /**
     *
     * @param player
     * @param index
     * @param amount
     * @return
     */
    int next(IPlayer player, int index, int amount);

}
