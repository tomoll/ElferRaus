/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.gui;

import de.htwg.elferraus.controller.IElferRausController;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Christian
 */
public class MainArrayPanel extends JPanel {

    //JPanel mainArrayPanel = new JPanel();
    JButton[] b1;

    public MainArrayPanel(IElferRausController controller) {

        setSize(200, 500);
        setLayout(new GridLayout(4, 3));

        b1 = new JButton[12];
        int i = 0;
        HashMap<String, Integer> temp;
        temp = controller.getActualPlayer().getTable();
        for (String s : temp.keySet()) {
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
                add(b1[i]);
            }

            if (temp.get(s) == null) {
                b1[i] = new JButton("---");
                b1[i].setBackground(c);
                add(b1[i]);
                i++;
            } else {
                b1[i] = new JButton(temp.get(s).toString());
                b1[i].setBackground(c);
                add(b1[i]);
                i++;
            }

        }
        setVisible(true);

//        setBorder(BorderFactory.createLineBorder(Color.black));
//        JButton card1 = new JButton("");
//        card1.setBackground(Color.black);
//    //    card1.addActionListener(this);
//        add(card1);
//    
//    }
//   
//    public Dimension getPreferredSize() {
//        return new Dimension(500,500);
//    }
//    
//    
//    
//    public void paint(Graphics g) {
//      g.drawString("Ausliegende Karten", 60, 10);
//
//      
//      g.setColor(Color.red);
//      g.drawRect (10, 100, 50, 75);
//      g.drawRect (90, 100, 50, 75);
//      g.drawRect (170, 100, 50, 75);
//      
//      g.setColor(Color.green);
//      g.drawRect (10, 200, 50, 75);
//      g.drawRect (90, 200, 50, 75);
//      g.drawRect (170, 200, 50, 75);
//
//      g.setColor(Color.blue);
//      g.drawRect (10, 300, 50, 75);
//      g.drawRect (90, 300, 50, 75);
//      g.drawRect (170, 300, 50, 75);
//      
//      g.setColor(Color.yellow);
//      g.drawRect (10, 400, 50, 75);
//      g.drawRect (90, 400, 50, 75);
//      g.drawRect (170, 400, 50, 75);
    }
//    
}
