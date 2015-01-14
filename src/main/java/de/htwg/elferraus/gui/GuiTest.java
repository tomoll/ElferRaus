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
    private  IElferRausController controller;
    //GuiTest hans = new GuiTest();
    private int spielerzahl;

    JPanel test = new JPanel();
    JButton test2 = new JButton("DIETER");
    boolean weiter = false; 
 

    public int GUIFrame(IElferRausController controller) {

        this.controller = controller;
        //this.controller = controller;
        //controller.addObserver(this);
        this.initialize();
        return spielerzahl = 4;
        
        

    }
 
    public void start(){
        mainWindow.setSize(600, 500);
        mainWindow.setLayout(new GridLayout(3,1));
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MainArrayPanel array = new MainArrayPanel(controller);
        MainStackPanel stack = new MainStackPanel();
        DeckPanel deck = new DeckPanel(controller);
        
        this.mainWindow.add(array);
        this.mainWindow.add(stack);
        this.mainWindow.add(deck);
        
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
        return spielerzahl;
    }

    public void iterate() {

    }

    public void printGUI() {
      //  mainArrayPanel.

    }

    public void update() {
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
