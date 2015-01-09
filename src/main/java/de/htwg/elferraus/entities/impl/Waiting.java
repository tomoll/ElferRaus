

package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.IPlayer;
import de.htwg.elferraus.entities.IStates;

/**
 *
 * @author Tobi
 */
public class Waiting implements IStates {

    /**
     *
     * @param player
     * @param index
     * @param amount
     * @return
     */
    public int next(IPlayer player, int index, int amount) {

        player.setState(new Playing());
        return index;
        
    }
    
}
