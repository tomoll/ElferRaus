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
public interface IPlayerDeck {
 public int getSize();
 public Card indexToCard(int i);
 public Card popplCard(Card c);
 public void addCard(Card c);

}
