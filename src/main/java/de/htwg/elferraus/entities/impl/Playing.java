
package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.IStates;



public class Playing implements IStates {
    
    public int next(Player player, int index, int amount){
  
        player.setState(new Waiting());
        if(index < amount-1){
            return (index + 1);
        }
        else{
            return 0;
        }
        
    }
}
