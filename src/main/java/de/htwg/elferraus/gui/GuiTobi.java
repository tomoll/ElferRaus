
package de.htwg.elferraus.gui;

import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.util.observer.IObserver;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Tobi
 */
public class GuiTobi extends JFrame implements IObserver, ActionListener {
    
    JFrame mainWindow = new JFrame("Elfer Raus");
    
    JButton exitButton = new JButton("Exit Game");
    JButton nextButton = new JButton("End Round");
    JButton blueLow;
    JButton blueEleven;
    JButton blueHigh;
    JButton greenLow;
    JButton greenEleven;
    JButton greenHigh;
    JButton redLow;
    JButton redEleven;
    JButton redHigh;
    JButton yellowLow;
    JButton yellowEleven;
    JButton yellowHigh;
    JButton mainStackButton;
    JPanel mainArrayPanel = new JPanel();
    JPanel mainStackPanel = new JPanel();
    JPanel playerPanel = new JPanel();
    JTextArea playerDeck = new JTextArea();
    JComboBox indexChooser = new JComboBox();
    JTextField playerAmount = new JTextField();
    JButton start = new JButton("Start");
    
    
    
    private final ElferRausController controller;
    
    public GuiTobi(ElferRausController controller){
        this.controller = controller;
        controller.addObserver(this);
        mainWindow.setLayout(new GridLayout());
        
        mainArrayPanel.setLayout(new GridLayout(4,3));
        mainStackPanel.setLayout(new GridLayout(3,1));
        playerPanel.setLayout(new GridLayout(1,2));
        mainStackButton.setSize(30, 50);
        mainStackButton.setBackground(Color.BLACK);
        exitButton.setSize(30,20);
        nextButton.setSize(30,20);
        mainStackPanel.add(mainStackButton);
        mainStackPanel.add(nextButton);
        mainStackPanel.add(exitButton);
        
    }

    public void initialize(){
        start.addActionListener(this);
        mainWindow.add(playerAmount);
        mainWindow.add(start);
    }
    
    public void iterate(){
        
        
    }
    
    public void printGUI(){
      //  mainArrayPanel.
        
    }
    
    
    
    
    
    public void update() {
        printGUI();
    }
    
     public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == this.start){
            int i = Integer.parseInt(playerAmount.getText());
            this.controller.setPlayer(i);
        }
        else if(ae.getSource() == this.nextButton){
            //label.setText("Button 2 wurde betätigt");
        }
        else if (ae.getSource() == this.exitButton){
            //label.setText(("Button 3 wurde betätigt"));
        }
    }
    
}
