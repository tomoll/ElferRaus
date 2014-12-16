/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.htwg.elferraus.controller.impl;

import de.htwg.elferraus.controller.IStates;

/**
 *
 * @author Christian
 */
public class Playing implements IStates {

    public int next(ElferRausController controller, int actualPlayer, int playerAmount) {
        int i = 0;
        if(controller.player[actualPlayer].deck.getSize()>0){
            controller.player[actualPlayer].setState(new Waiting());
            if(actualPlayer < playerAmount){
                controller.player[actualPlayer + 1].setState(new Playing());
                i = actualPlayer +1;
            }
            else {
                controller.player[0].setState(new Playing());
                i= 0;
            }
                
        } else {             //passt noch ned ganz so gewinnen ja irgendwann alle!!
            controller.player[actualPlayer].setState(new Winner());

        }
        return i;
    }
    
}
