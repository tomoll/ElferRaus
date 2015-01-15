package de.htwg.elferraus.entities;

/**
 * Interface for the different states
 * @author Tobi
 */
public interface IStates {

    /**
     * the method for go on
     * @param player
     * @param index
     * @param amount
     * @return
     */
    int next(IPlayer player, int index, int amount);

}
