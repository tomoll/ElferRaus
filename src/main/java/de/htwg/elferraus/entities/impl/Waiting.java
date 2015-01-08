

package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.IStates;


public class Waiting implements IStates {

    public int next(Player player, int index, int amount) {

        player.setState(new Playing());
        return index;
        
    }
    
}
