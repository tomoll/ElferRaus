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
public class Looser implements IStates {

    public int next(ElferRausController controller, int actualPlayer, int playerAmount) {
        return actualPlayer;
    }

}
