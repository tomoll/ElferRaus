package de.htwg.elferraus;

import de.htwg.elferraus.controller.*;
import de.htwg.elferraus.entities.MainArray;
import de.htwg.elferraus.entities.MainStack;
import de.htwg.elferraus.tui.Tui;

public class ElferRaus {

    public static void main(String[] args) {

        Tui tui = new Tui(new ElferRausController(2, new MainArray(), new MainStack(true)));
        tui.printTUI();
        // continue until the user decides to quit
        boolean quit = false;
        while (!quit) {
            quit = tui.iterate();
        }
    }

}
