/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.htwg.elferraus.gui;

import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author Christian
 */
public class GuiTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIFrame();
    }
    private static void GUIFrame() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("Elfer Raus");
        f.getContentPane().setLayout(new GridLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new MainArrayPanel());
        f.getContentPane().add(new MainStackPanel());
        f.getContentPane().add(new OptionsPanel());
        f.getContentPane().add(new DeckPanel());
        f.pack();
        f.setVisible(true);
    }
}
