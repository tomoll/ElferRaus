/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.controller;

import de.htwg.elferraus.controller.impl.ElferRausController;

/**
 *
 * @author Christian
 */
public interface IStates {

    public int next(ElferRausController controller, int actualPlayer, int playerAmount);

}
