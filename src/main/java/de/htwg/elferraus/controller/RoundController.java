package de.htwg.elferraus.controller;

import de.htwg.elferraus.entities.*;
import de.htwg.util.observer.Observable;


public class RoundController extends Observable {
   
    //Anzahl Spieler 
    //Rundenfunktion, steuert wer gerade dran ist gibt bescheid für nächsten Spieler
    //leitet Ausgabe ein?
    //teilt Karten am Anfang vom Spiel aus 
    private int players;
    
    
    private int a;
    
    public RoundController(){
        a = 3;
    }

    public void round() {
        a =4;
    }

}
