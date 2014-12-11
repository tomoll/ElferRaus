/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.tui;

import de.htwg.elferraus.controller.ElferRausController;
import de.htwg.util.observer.IObserver;
import java.util.Scanner;

/**
 *
 * @author Tobi
 */
public class Tui implements IObserver {

    private ElferRausController controller;
    Scanner scanner;
    String line = "";

    public Tui(ElferRausController controller) {
        this.controller = controller;
        controller.addObserver(this);
        scanner = new Scanner(System.in);
    }

    public boolean iterate() {
        return handleInputOrQuit(scanner.next());
    }

    public void printTUI() {

    }

    public boolean handleInputOrQuit(String line) {
        boolean quit = false;
                       
        if (line.equalsIgnoreCase("1")) {
            
        }
        else if (line.equalsIgnoreCase("2")) {
            quit = true;
        }
        else if (line.equalsIgnoreCase("3")) {
            quit = true;
        }
        else if (line.equalsIgnoreCase("4")) {
            //Do nothing, just redraw the updated grid
        }
        else if (line.equalsIgnoreCase("5")) {
            quit = true;
        }
        else {
            System.out.println("Falsche Eingabe!");
        }
        return quit;
    }

    @Override
    public void update() {
        printTUI();
    }

}
