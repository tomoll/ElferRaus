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

  /*  //steuert Aktionen des aktuellen Spielers
    //regelt Spielregeln
    //kontrolliert Legeaktionen
    //beendet Spiel wenn Spieler keine Karten mehr hat 
    private GameStates currentstate;
    private boolean permissionToContinue = false;
    private int stackCards = 0;
    private Card thisCard;
    private PlayerDeck deck;
    private static MainArray main;
    private static MainStack stack;

    public PlayerController() {
        currentstate = new GameStates.ready();
    }

    public void setState(GameStates s) {
        currentstate = s;
    }

    public void setCard(Card choosedCard, String colour) {
        thisCard = deck.popplCard(choosedCard);
        if (thisCard != null) {
            String thisColour = thisCard.getColour();
            int thisNumber = thisCard.getNumber();
            if (thisColour.equals(colour)) {
                if (thisNumber == 11) {
                    main.setEleven(thisCard);
                    setPermission(true);
                } else if ((thisNumber + 1) == main.getLow(thisColour).getNumber()) {
                    main.setLow(thisCard);
                    setPermission(true);
                } else if ((thisNumber - 1) == main.getHigh(thisColour).getNumber()) {
                    main.setHigh(thisCard);
                    setPermission(true);
                } else {
                    System.out.println("Kann nicht angelegt werden!!! Vorgängerkarte nicht vorhanden");
                }

            }
        } else {
            System.out.println("Karte nicht vorhanden!!!");
        }

    }

    public void getCard() {
        if (stack.getAmount() > 0 && !permissionToContinue && stackCards < 3) {
            deck.addCard(stack.popCard());
            stackCards++;

        } else {
            setPermission(true);
        }
    }

    public void nextPlayer() {
        if(permissionToContinue){
            stackCards = 0;
            setState(new GameStates.ready());
        }

    }

    public void setPermission(boolean state) {
        permissionToContinue = state;
    }
*/
}
