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
public interface IMainArray {
   
    public void setHigh(Card c);
    
    public void setLow(Card c);
    
    public Card getHigh(String colour);
    
    public Card getLow(String colour);
    
    public void setEleven(Card eleven);
}
