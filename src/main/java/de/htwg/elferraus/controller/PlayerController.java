/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.controller;

import de.htwg.elferraus.controller.States.*;
import de.htwg.elferraus.entities.*;

/**
 *
 * @author Tobi
 */
public class PlayerController {
    //steuert Aktionen des aktuellen Spielers
    //regelt Spielregeln
    //kontrolliert Legeaktionen
    //beendet Spiel wenn Spieler keine Karten mehr hat 
    private GameStates currentstate;
    private boolean permissionToContinue;
    private Card thisCard;
    private PlayerDeck deck;
    
    
    

    public PlayerController() {
        currentstate = new ready();
    }
    
    
    public void setState(GameStates s){
        currentstate = s;
    }
    
    public void setCard(Card choosedCard){
        if(deck.contains(choosedCard))
        thisCard = deck.popplCard(choosedCard);
        String colour = thisCard.getColour();
        if(thisCard.get()<11){
            if(thisCard.getNumber()==)
            
        } else if(thisCard.getNumber()>11){
            
        }
    }
    
    public void getCard(){
        
    }
    
    public void nextPlayer(){
        
    }
    
    public void setPermission(boolean state){
        permissionToContinue = state;
    }
    
    
}
