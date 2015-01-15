package de.htwg.elferraus.gui;

import de.htwg.elferraus.controller.IElferRausController;
import de.htwg.elferraus.controller.impl.ElferRausController;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Christian
 */
public class GuiTest implements ActionListener {

    JFrame mainWindow = new JFrame("Elfer Raus");
    //JComboBox indexChooser = new JComboBox();
    JTextField playerAmount = new JTextField();
    JButton start = new JButton("Start");
    static IElferRausController controller;
    //GuiTest hans = new GuiTest();
    private int spielerzahl;

    JPanel test = new JPanel();
    JButton test2 = new JButton("DIETER");
    boolean weiter = false; 
    static DeckPanel deck;
 

    public int GUIFrame(IElferRausController controller) {

        this.controller = controller;
        //this.controller = controller;
        //controller.addObserver(this);
        spielerzahl = this.initialize();
        return spielerzahl;
        
        

    }
 
    public void start(){
        //JFrame mainWindow = new JFrame("Elfer Raus");
        mainWindow.setSize(600, 500);
        mainWindow.setLayout(new GridLayout(3,1));
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MainArrayPanel array = new MainArrayPanel(controller);
        MainStackPanel stack = new MainStackPanel();
         deck = new DeckPanel(controller);
        
      
        
        mainWindow.add(array);
        mainWindow.add(stack);
        mainWindow.add(deck);
        mainWindow.pack();
        mainWindow.setVisible(true);
    }

    public int initialize() {
        JFrame startWindow = new JFrame("Welcome");
        startWindow.setSize(200, 180);
        startWindow.setLayout(new GridLayout());
        startWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.addActionListener(this);
        startWindow.add(playerAmount);
        startWindow.add(start);
        test.add(test2);
        startWindow.add(test);
        System.out.println((playerAmount.getText()));
        startWindow.setVisible(true);
        //irgendwie noch aufhalten das erst der rest gestartet wird wenn spieleranzahl gesetzt wurde!!
        //return spielerzahl;
        return 2;
    }

    public void iterate() {

    }

    public static void printGUI() {
       deck.updateUI();
    }

    public static void update() {
        printGUI();
    }
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        JFrame f = new JFrame("Elfer Raus");
//        f.getContentPane().setLayout(new GridLayout());
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   //     f.getContentPane().add(new MainArrayPanel());
//        f.getContentPane().add(new MainStackPanel());
//        f.getContentPane().add(new OptionsPanel());
//        f.getContentPane().add(new DeckPanel());
//        f.pack();
//        f.setVisible(true);

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.start){
            System.out.println(Integer.parseInt(playerAmount.getText()));
            spielerzahl = Integer.parseInt(playerAmount.getText());
            //controller.setPlayer(Integer.parseInt(playerAmount.getText()));
            
    }
}
}
