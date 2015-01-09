
package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.IPlayer;
import de.htwg.elferraus.entities.IStates;

/**
 *
 * @author Tobi
 */
public class Playing implements IStates {
    
    /**
     *
     * @param player
     * @param index
     * @param amount
     * @return
     */
    public int next(IPlayer player, int index, int amount){
  
        player.setState(new Waiting());
        if(index < amount-1){
            return (index + 1);
        }
        else{
            return 0;
        }
        
    }
}
