package de.htwg.elferraus.controller;

import de.htwg.elferraus.entities.*;
import de.htwg.util.observer.Observable;


public class ElferRausController extends Observable {
    //Table oder sowas wo ganze Spieltisch zusammen gebaut wird 
    int a;
    
    public ElferRausController(){
        a = 3;
    }

    public void round() {
        a =4;
    }

}
