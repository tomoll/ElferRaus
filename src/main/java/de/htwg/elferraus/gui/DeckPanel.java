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
import java.util.HashMap;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Christian
 */
public class DeckPanel extends JPanel implements ActionListener {

    private JButton[] cards;
    private static final int MAXIMUM_CARDS = 40;

    /**
     *
     */
    public DeckPanel() {
        setSize(400, 500);
        setLayout(new GridLayout(8, 5));

        cards = new JButton[MAXIMUM_CARDS];
        HashMap<Integer, HashMap<String, Integer>> temp = GuiTest.getController().getActualPlayer().getHand();
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).keySet() != null) {
                Set st = temp.get(i).keySet();
                String s = st.toString();
                char x = s.charAt(1);
                s = "" + x;
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

                cards[i] = new JButton(temp.get(i).get(s).toString());
                cards[i].setBackground(c);
                cards[i].setForeground(c);
                cards[i].addActionListener(this);
                add(cards[i]);

            }
        }
        JTextField actualPlayer = new JTextField("Now Pl " + (GuiTest.getController().getIntPlayer()+1));
        add(actualPlayer);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 40; i++) {
            if (e.getSource() == this.cards[i]) {
                GuiTest.getController().setCardRequest(i + 1);
                updateUI();
            }
        }
    }

}
