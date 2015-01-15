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
     *
     * @param args
     */
    public static void main(String[] args) {

        // Set up logging through log4j
        //PropertyConfigurator.configure("/Users/Tobi/NetBeansProjects/SE2014WS-19-ElferRaus/ElferRaus/log4j.properties");
        
        
        Injector injector = Guice.createInjector(new ElferRausModule());
        controller = injector.getInstance(IElferRausController.class);
        controller.setInjector(injector);
//        tui = new Tui(controller);
//        int i = tui.initialize();
//        controller.setInjector(injector);             ganze Block gut nur für Gui
//        controller.setPlayer(i);
//        boolean quit = false;
        
        
        GuiTest dieter = new GuiTest(controller);
        int i = dieter.GUIFrame();                              //alles scheiß für gui
        controller.setInjector(injector); 
        controller.setPlayer(i);
//        
//        scanner = new Scanner(System.in);
//        while (!quit) {
//            //tui.inputLine(scanner.nextLine());          ganze Block gut nur für Gui
//            quit = tui.iterate();
//        }
    }

}
