package de.htwg.elferraus;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.htwg.elferraus.controller.IElferRausController;
import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;
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
     * static BlackJack instance.
     */
    private static ElferRaus instance = null;
    /**
     * BlackJackController.
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
        PropertyConfigurator.configure("log4j.properties");
    }
    
    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        Tui tui = new Tui(new ElferRausController(2, new MainArray(), new MainStack(true)));
        tui.printTUI();

        boolean quit = false;
        while (!quit) {
            quit = tui.iterate();
        }
                */
    
    ElferRaus game = ElferRaus.getInstance();
    
    game.getTui().initialize();
    boolean quit = false;
        while (!quit) {
            quit = game.getTui().iterate();
        }
    }
                

}
