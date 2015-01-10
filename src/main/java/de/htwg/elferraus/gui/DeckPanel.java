/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.htwg.elferraus.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Christian
 */
public class DeckPanel extends JPanel implements ActionListener{
    public DeckPanel() {

        setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel welcome = new JLabel("Deine Karten : ");
        add(welcome);
        JButton
                
        card1 = new JButton("11");
        card1.setBackground(Color.red);
        card1.addActionListener(this);
        add(card1);
        JButton card2 = new JButton("7");
        card2.setBackground(Color.yellow);
        add(card2);
        JButton card3 = new JButton("19");
        card3.setBackground(Color.blue);
        add(card3);  
    }
     public void actionPerformed(ActionEvent e) {
       // if(e.getSource() == card1){
        //    System.out.println("Button geklickt!");
        //} 
     }
    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }
}
