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
import javax.swing.JTextField;

/**
 *
 * @author Christian
 */
public class MainArrayPanel extends JPanel {
    public MainArrayPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    
    }
   
    public Dimension getPreferredSize() {
        return new Dimension(500,500);
    }
    public void paint(Graphics g) {
      g.drawString("Ausliegende Karten", 60, 10);

      g.setColor(Color.red);
      g.drawRect (10, 100, 50, 75);
      g.drawRect (90, 100, 50, 75);
      g.drawRect (170, 100, 50, 75);
      
      g.setColor(Color.green);
      g.drawRect (10, 200, 50, 75);
      g.drawRect (90, 200, 50, 75);
      g.drawRect (170, 200, 50, 75);

      g.setColor(Color.blue);
      g.drawRect (10, 300, 50, 75);
      g.drawRect (90, 300, 50, 75);
      g.drawRect (170, 300, 50, 75);
      
      g.setColor(Color.yellow);
      g.drawRect (10, 400, 50, 75);
      g.drawRect (90, 400, 50, 75);
      g.drawRect (170, 400, 50, 75);
   }
    
}
