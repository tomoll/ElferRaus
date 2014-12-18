/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.htwg.elferraus.entities.impl;

//import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.IStates;

/**
 *
 * @author Christian
 */
public class Playing implements IStates {
    
    public int next(Player player, int index, int amount){
    //Gewonnen/Verloren jetzt über Controller weil Logik
    //hier noch noch Wechsel von spielend auf wartend
    //aktueller Spieler wird auf Waiting gesetzt
    //Rueckgabe der States immer aktueller Spieler
    //also nachdem aktueller nun wartet ist das jetzt entweder der nächste oder der erste
        player.setState(new Waiting());
        if(index < amount){
            return (index + 1);
        }
        else{
            return 0;
        }
        
    }
}
    /*So wars vorher, dürfen aber hier nicht auf den controller zugreifen
    macht also alles weng schwierig , kommentiers aber mal nur aus weil meins 
    au net so ganz passt und wir da nen zwischenweg brauchen
    ------------------------------------------
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
    
}   ------------------------------------------
    */
    
