package de.htwg.elferraus;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.htwg.elferraus.controller.IElferRausController;
import de.htwg.elferraus.tui.Tui;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Tobi
 */
public final class ElferRaus {
    /**
     * tui.
     */
    private final Tui tui;
    /**
     * static ElferRaus instance.
     */
    private static ElferRaus instance = null;
    /**
     * ElferRausController.
     */
    private IElferRausController controller;

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
     * @return tui
     */
    public Tui getTui() {
        return tui;
    }

    /**
     *
     */
    private ElferRaus() {
        // Set up Google Guice Dependency Injector
        Injector injector = Guice.createInjector(new ElferRausModule());
        // Build up the application, resolving dependencies automatically by
        // Guice
        controller = injector.getInstance(IElferRausController.class);
        tui = injector.getInstance(Tui.class);

        controller.create();

         // Set up logging through log4j
        //PropertyConfigurator.configure("/Users/Tobi/NetBeansProjects/SE2014WS-19-ElferRaus/ElferRaus/log4j.properties");
    }
    
    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        
    ElferRaus game = ElferRaus.getInstance();
    
    game.getTui().initialize();
    boolean quit = false;
        while (!quit) {
            quit = game.getTui().iterate();
        }
    }
                

}
