package de.htwg.elferraus.controller;

import de.htwg.elferraus.entities.*;
import de.htwg.util.observer.Observable;


public class ElferRausController extends Observable {
   
    //Anzahl Spieler 
    //Rundenfunktion, steuert wer gerade dran ist gibt bescheid für nächsten Spieler
    //leitet Ausgabe ein?
    //teilt Karten am Anfang vom Spiel aus 
    
    private String statusMessage = "Welcome to ElferRaus";
    private int playerAmount;
    private PlayerController[] player = new PlayerController[playerAmount];
    public MainArray playTable;
    public MainStack stack;
    
    
    public ElferRausController(int players, MainArray playTable, MainStack stack){
        this.playerAmount = players;
        this.playTable = playTable;
        this.stack = stack;
    }

    public PlayerController nextPlayer(int i){
        return player[i+1];
    }
    
}
