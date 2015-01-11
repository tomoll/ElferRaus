/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.htwg.elferraus.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Christian
 */
public class MainStackPanel extends JPanel{
    
    JPanel mainStackPanel = new JPanel();
    JButton mainStackButton;
    JButton exitButton = new JButton("Exit Game");
    JButton nextButton = new JButton("End Round");
    
    
    
    
    
    
    
    
    public MainStackPanel() {
        
        
        mainStackButton.setSize(30, 50);
        mainStackButton.setBackground(Color.BLACK);
        exitButton.setSize(30,20);
        nextButton.setSize(30,20);
        mainStackPanel.add(mainStackButton);
        mainStackPanel.add(nextButton);
        mainStackPanel.add(exitButton);
        
        
        
        
        
        setBorder(BorderFactory.createLineBorder(Color.black));
            JLabel welcome = new JLabel("Kartenstapel : ");
        add(welcome);
        JButton card1 = new JButton("");
        card1.setBackground(Color.black);
    //    card1.addActionListener(this);
        add(card1);
       
    }

    public Dimension getPreferredSize() {
        return new Dimension(250,200);
        
    }

}
