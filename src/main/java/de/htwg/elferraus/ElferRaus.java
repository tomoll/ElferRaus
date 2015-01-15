package de.htwg.elferraus;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.htwg.elferraus.controller.IElferRausController;
import de.htwg.elferraus.gui.GuiTest;
import de.htwg.elferraus.tui.Tui;
import java.util.Scanner;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Tobi
 */
public final class ElferRaus {

    private static boolean quit = false;
    /**
     * tui.
     */
    private static Tui tui;
    /**
     * static ElferRaus instance.
     */
    private static ElferRaus instance = null;
    /**
     * ElferRausController.
     */
    private static IElferRausController controller;


    private static Scanner scanner;
    /**
     * Singleton.
     *
     * @return instance
     */
    public static ElferRaus getInstance() {
        if (instance == null) {
            instance = new ElferRaus();
        }

        return instance;

    }
    /**
     * the main
     * @param args
     */
    public static void main(String[] args) {

        
        PropertyConfigurator.configure("/Users/Tobi/NetBeansProjects/SE2014WS-19-ElferRaus/ElferRaus/log4j.properties");
        
        Injector injector = Guice.createInjector(new ElferRausModule());
        controller = injector.getInstance(IElferRausController.class);
        controller.setInjector(injector);
        tui = new Tui(controller);
       
        GuiTest dieter = new GuiTest(controller);
        int i = dieter.GuiFrame();                        
        controller.setInjector(injector); 
        controller.setPlayer(i);
        tui.initialize();
        
        scanner = new Scanner(System.in);
        while (!quit) {
            quit = tui.handleInputOrQuit(scanner.nextLine());
        }
    }

}
