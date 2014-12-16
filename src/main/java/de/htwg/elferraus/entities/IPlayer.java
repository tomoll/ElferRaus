/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.htwg.elferraus.entities;

import de.htwg.elferraus.entities.impl.Card;

/**
 *
 * @author Christian
 */
public interface IPlayer {
    public boolean setCard(Card chosenCard);
    public boolean getCard();
}
