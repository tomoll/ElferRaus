package de.htwg.elferraus;

import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;
import de.htwg.elferraus.tui.Tui;

public final class ElferRaus {
    


    public static void main(String[] args) {

        Tui tui = new Tui(new ElferRausController(2, new MainArray(), new MainStack(true)));
        tui.printTUI();

        boolean quit = false;
        while (!quit) {
            quit = tui.iterate();
        }
    }

}
