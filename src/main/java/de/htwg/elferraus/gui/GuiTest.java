package de.htwg.elferraus.gui;

import de.htwg.elferraus.controller.IElferRausController;
import de.htwg.util.observer.IObserver;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Christian
 */
public class GuiTest implements ActionListener, IObserver {

    private JFrame mainWindow = new JFrame();
    private JFrame startWindow;
    private JTextField playerAmount = new JTextField();
    private JButton start = new JButton("Start");
    private static IElferRausController controller;
    private int spielerzahl = Integer.MAX_VALUE;
    private final int MAX_PLAYERS = 6;
    private final int WAITTIME = 2000;
    private final int XSIZE = 800;
    private final int YSIZE = 600;
    private final int SXSIZE = 200;
    private final int SYSIZE = 150;

    /**
     *
     * @param controller
     */
    public GuiTest(IElferRausController controller) {
        this.controller = controller;
        this.controller.addObserver(this);
          
    }

    /**
     *
     * @return
     */
    public int GuiFrame() {

        this.initialize();
        while (spielerzahl > MAX_PLAYERS) {
            try {
                Thread.sleep(WAITTIME);
            } catch (InterruptedException ex) {
                Logger.getLogger(GuiTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        startWindow.setVisible(false);
        startWindow.dispose();
        return spielerzahl;

    }

    /**
     *
     */
    public void start() {
        startWindow.setVisible(false);
        mainWindow.setVisible(false);
        mainWindow = new JFrame("Elfer Raus");
        mainWindow.setSize(XSIZE, YSIZE);
        mainWindow.setLayout(new GridLayout());
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      

        MainArrayPanel array = new MainArrayPanel();
        MainStackPanel stack = new MainStackPanel();
        DeckPanel deck = new DeckPanel();

        mainWindow.add(array);
        mainWindow.add(stack);
        mainWindow.add(deck);
        mainWindow.pack();
        mainWindow.setVisible(true);
    }

    /**
     *
     */
    public void initialize() {
        startWindow = new JFrame("Welcome");
        startWindow.setSize(SXSIZE, SYSIZE);
        startWindow.setLayout(new GridLayout());
        startWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.addActionListener(this);
        startWindow.add(playerAmount);
        startWindow.add(start);
        startWindow.setVisible(true);

    }

    @Override
    public void update() {
        start();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.start) {
            spielerzahl = Integer.parseInt(playerAmount.getText());

        }
    }
    
    public static IElferRausController getController(){
        return controller;
    }
}
