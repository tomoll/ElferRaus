package de.htwg.elferraus.tui;

import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.util.observer.IObserver;
import java.util.Scanner;


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
        System.out.print(controller.getMainString());
        System.out.print(controller.getStatusMessage());
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
            controller.removeObserver(this);
            controller.removeAllObservers();
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
