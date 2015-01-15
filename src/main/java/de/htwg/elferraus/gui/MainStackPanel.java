
package de.htwg.elferraus.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Christian
 */
public class MainStackPanel extends JPanel implements ActionListener{
    
    JButton mainStackButton;
    JButton exitButton = new JButton("Exit Game");
    JButton nextButton = new JButton("End Round");
    
    /**
     *
     */
    public MainStackPanel() {
        
        setSize(200,500);
        setLayout(new GridLayout(3,1));
        mainStackButton = new JButton("Main Stack");
        mainStackButton.setSize(30, 50);
        mainStackButton.setBackground(Color.BLACK);
        exitButton.setSize(30,20);
        nextButton.setSize(30,20);
        
        mainStackButton.addActionListener(this);
        exitButton.addActionListener(this);
        nextButton.addActionListener(this);
        add(mainStackButton);
        add(nextButton);
        add(exitButton);
        setVisible(true);
        
  
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250,200);
        
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.nextButton){
            GuiTest.getController().setEndRound();
        }
        else if(e.getSource()==this.mainStackButton){
            GuiTest.getController().getCardRequest();
        }
    }

}
