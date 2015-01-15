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

    JFrame mainWindow = new JFrame();
    JFrame startWindow;
    JTextField playerAmount = new JTextField();
    JButton start = new JButton("Start");
    static IElferRausController controller;
    private int spielerzahl = 10;

    public GuiTest(IElferRausController controller) {
        this.controller = controller;
        this.controller.addObserver(this);
          
    }

    public int GUIFrame() {

        this.initialize();
        while (spielerzahl > 6) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GuiTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        startWindow.setVisible(false);
        startWindow.dispose();
        return spielerzahl;

    }

    public void start() {
        startWindow.setVisible(false);
        mainWindow.setVisible(false);
        mainWindow = new JFrame("Elfer Raus");
        mainWindow.setSize(800, 500);
        mainWindow.setLayout(new GridLayout(1, 3));
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

    public void initialize() {
        startWindow = new JFrame("Welcome");
        startWindow.setSize(200, 180);
        startWindow.setLayout(new GridLayout());
        startWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.addActionListener(this);
        startWindow.add(playerAmount);
        startWindow.add(start);
        startWindow.setVisible(true);

    }

    public void iterate() {

    }

    public static void printGUI() {
        //deck.updateUI();
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
}
