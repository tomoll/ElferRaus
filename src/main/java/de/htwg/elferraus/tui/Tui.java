package de.htwg.elferraus.tui;


import de.htwg.elferraus.controller.IElferRausController;
import de.htwg.util.observer.IObserver;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author Tobi
 */
public class Tui implements IObserver {

    private final IElferRausController controller;
    private final Scanner scanner;
    private Scanner subscanner;
    private Logger logger = Logger.getLogger("de.htwg.elferraus.view.tui");

    /**
     *
     * @param controller
     */

    public Tui(final IElferRausController controller) {

        this.controller = controller;
        this.controller.addObserver(this);
        scanner = new Scanner(System.in);
    }

    /**
     *
     * @return
     */
    public int initialize() {
        System.out.println("How Many Players??");
        int i;
        subscanner = new Scanner(System.in);
        i = Integer.parseInt(subscanner.next());
        return i;
    }

    /**
     *
     * @return
     */
    public boolean iterate() {
        return handleInputOrQuit(scanner.next());    
    }

    /**
     *
     * @return 
     */
    public boolean printTUI() {
        System.out.print(controller.getMainString());
        System.out.print(controller.getStatusMessage());
        return true;
    }

    /**
     *
     * @param line
     * @return
     */
    public boolean handleInputOrQuit(String line) {
        boolean quit = false;

        if (line.equalsIgnoreCase("1")) {
            controller.getCardRequest();
        } else if (line.equalsIgnoreCase("2")) {
            System.out.println("Please enter the index: ");
            int i;
            subscanner = new Scanner(System.in);
            i = Integer.parseInt(subscanner.next());
            controller.setCardRequest(i);
        } else if (line.equalsIgnoreCase("3")) {
            controller.setEndRound();
        } else if (line.equalsIgnoreCase("4")) {
            this.controller.removeObserver(this);
            quit = true;
        } else {
            System.out.println("Falsche Eingabe!");
        }
        return quit;
    }

    /**
     *
     */
    @Override
    public void update() {
        printTUI();
    }

}
