/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.htwg.elferraus.entities.impl;

//import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.IStates;

/**
 *
 * @author Christian
 */
public class Waiting implements IStates {
//Vom Controller heraus wird der wartende Spieler aufgerufen
//der als nächstes dran is(wird in playing festgelgt)
//gibt sein eigenen Index zurück -> Rückgabe von next ist immer aktueller Player
    
    public int next(Player player, int index, int amount) {

        player.setState(new Playing());
        return index;
        
    }
    
}
