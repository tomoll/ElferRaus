/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.tui;

import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.util.observer.IObserver;
import java.util.Scanner;

/**
 *
 * @author Tobi
 */
public class Tui implements IObserver {

    private ElferRausController controller;
    private Scanner scanner;
    private Scanner subscanner;
    private String line = "";

    public Tui(ElferRausController controller) {
        this.controller = controller;
        controller.addObserver(this);
        scanner = new Scanner(System.in);
    }

    public boolean iterate() {
        return handleInputOrQuit(scanner.next());
    }

    public void printTUI() {
        System.out.println(controller.getMainString());
        System.out.println("------------------------------");
        System.out.println(controller.currentPlayerString());
        System.out.println("------------------------------");
        System.out.println("Please enter a command:");
        System.out.println("------------------------------");
        System.out.println("1. Get new card from Stack");
        System.out.println("2. Lay down card at Index");
        System.out.println("3. End Round");
        System.out.println("4. Update cards");
        System.out.println("5. Quit Game");

    }

    public boolean handleInputOrQuit(String line) {
        boolean quit = false;
                       
        if (line.equalsIgnoreCase("1")) {
            controller.getCardRequest();
        }
        else if (line.equalsIgnoreCase("2")) {
            System.out.println("Please enter the index: ");
            int i;
            subscanner = new Scanner(System.in);
            i = Integer.parseInt(subscanner.next());
            controller.setCardRequest(i);
        }
        else if (line.equalsIgnoreCase("3")) {
           controller.setEndRound();
        }
        else if (line.equalsIgnoreCase("4")) {
            int i = 1; //hier muss noch was gemacht werden nur um sonar zu beruhigen!!
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
