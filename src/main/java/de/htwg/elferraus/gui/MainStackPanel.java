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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Christian
 */
public class MainStackPanel extends JPanel{
    public MainStackPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
       
    }

    public Dimension getPreferredSize() {
        return new Dimension(250,200);
        
    }
    public void paint(Graphics g) {
      g.drawString("Kartenstapel", 0, 10);
      g.setColor(Color.black);
      
      g.fillRect (10, 200, 50, 75);
     

    
}
}
