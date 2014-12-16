/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.htwg.elferraus.controller;

import de.htwg.elferraus.entities.impl.Player;

/**
 *
 * @author Christian
 */
public interface IElferRausController {
    public Player nextPlayer(int i);
    public boolean setEndRound();
    public boolean setCardRequest(int next);
    public void getCardRequest();
    public String currentPlayerString();
    public String getMainString();
}
