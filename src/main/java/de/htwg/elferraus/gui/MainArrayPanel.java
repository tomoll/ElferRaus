
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

    private JButton[] b1;
    private static final int SIZE = 12;

    /**
     *
     */
    public MainArrayPanel() {

        setSize(200, 500);
        setLayout(new GridLayout(4, 3));

        b1 = new JButton[SIZE];

        HashMap<Integer, HashMap<String, Integer>> temp;
        temp = GuiTest.getController().getActualPlayer().getTable();
        for (int i = 0; i < SIZE; i++) {
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
                c = Color.ORANGE;
            }

            if (temp.get(i).get(s) == null) {
                b1[i] = new JButton("---");
                //b1[i].setBackground(c);   //Windows-Version
                b1[i].setForeground(c);     //Mac-Version

                add(b1[i]);
            } else {
                b1[i] = new JButton(temp.get(i).get(s).toString());
                //b1[i].setBackground(c);   //Windows-Version
                b1[i].setForeground(c);     //Mac-Version

                add(b1[i]);
            }

        }
        setVisible(true);

    }
}
