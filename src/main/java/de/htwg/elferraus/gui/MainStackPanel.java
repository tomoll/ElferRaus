/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    JPanel mainStackPanel = new JPanel();
    JButton mainStackButton;
    JButton exitButton = new JButton("Exit Game");
    JButton nextButton = new JButton("End Round");
    
    
    
    
    
    
    
    
    public MainStackPanel() {
        
        mainStackPanel.setSize(200, 500);
        mainStackPanel.setLayout(new GridLayout(3,1));
        mainStackButton = new JButton("Main Stack");
        mainStackButton.setSize(30, 50);
        mainStackButton.setBackground(Color.BLACK);
        exitButton.setSize(30,20);
        nextButton.setSize(30,20);
        
        mainStackButton.addActionListener(this);
        exitButton.addActionListener(this);
        nextButton.addActionListener(this);
        
        mainStackPanel.add(mainStackButton);
        mainStackPanel.add(nextButton);
        mainStackPanel.add(exitButton);
        
        mainStackPanel.setVisible(true);
        
        
        
        
        
        
        
        
//        setBorder(BorderFactory.createLineBorder(Color.black));
//            JLabel welcome = new JLabel("Kartenstapel : ");
//        add(welcome);
//        JButton card1 = new JButton("");
//        card1.setBackground(Color.black);
//    //    card1.addActionListener(this);
//        add(card1);
       
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250,200);
        
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.exitButton){
            //Spiel irgendwie beenden
        }
        else if(e.getSource()==this.nextButton){
            //Nächster Spieler
        }
        else if(e.getSource()==this.mainStackButton){
            //Karte vom Stack ziehen
        }
    }

}
