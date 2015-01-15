/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Christian
 */
public class MainArrayPanel extends JPanel {

    JButton[] b1;
    private final int SIZE = 12;

    public MainArrayPanel() {

        setSize(200, 500);
        setLayout(new GridLayout(4, 3));

        b1 = new JButton[SIZE];

        HashMap<Integer, HashMap<String, Integer>> temp;
        temp = GuiTest.controller.getActualPlayer().getTable();
        for(int i= 0; i<SIZE;i++){
        Set st = temp.get(i).keySet();
            String s = st.toString();
            Color c = Color.BLACK;
            if (s.equals("b")) {
                c = Color.BLUE;
            }
            if (s.equals("g")) {
                c = Color.GREEN;
            }
            if (s.equals("r")) {
                c = Color.RED;
            }
            if (s.equals("y")) {
                c = Color.YELLOW;
            }
            if (i == 1 || i == 3 || i == 5 || i == 7) {
                b1[i] = new JButton("11");
                b1[i].setBackground(c);
                //b1[i].setForeground(c);
                add(b1[i]);
            }

            if (temp.get(s) == null) {
                b1[i] = new JButton("---");
                b1[i].setBackground(c);
                //b1[i].setForeground(c);
                add(b1[i]);
                i++;
            } else {
                b1[i] = new JButton(temp.get(s).toString());
                b1[i].setBackground(c);
               // b1[i].setForeground(c);
                add(b1[i]);
                i++;
            }

        }
        setVisible(true);


    }   
}
