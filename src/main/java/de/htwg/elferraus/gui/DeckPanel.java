/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.gui;

import de.htwg.elferraus.controller.IElferRausController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Christian
 */
public class DeckPanel extends JPanel implements ActionListener {

    //JPanel playerPanel = new JPanel();
    private final IElferRausController controller;

    JTextArea playerDeck = new JTextArea();
    JButton[] cards;

    public DeckPanel(IElferRausController controller) {
        this.controller = controller;
        playerDeck.setSize(200, 500);

        playerDeck.setLayout(new GridLayout());

        int i = 0;
        cards = new JButton[40];
        HashMap<String, Integer> temp = controller.getActualPlayer().getHand();
        for(String s : temp.keySet()){
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
            
            

            cards[i] = new JButton(temp.get(s).toString());
            cards[i].setBackground(c);
            cards[i].addActionListener(this);
            playerDeck.add(cards[i]);
            i++;

        }
        add(playerDeck);
        setVisible(true);
        System.out.println(controller.getMainString());
//
//        setBorder(BorderFactory.createLineBorder(Color.black));
//        JLabel welcome = new JLabel("Deine Karten : ");
//        add(welcome);
//        JButton card1 = new JButton("11");
//        card1.setBackground(Color.red);
//        card1.addActionListener(this);
//        add(card1);
//        JButton card2 = new JButton("7");
//        card2.setBackground(Color.yellow);
//        add(card2);
//        JButton card3 = new JButton("19");
//        card3.setBackground(Color.blue);
//        add(card3);
    }

    public void actionPerformed(ActionEvent e) {
        for(int i=0; i<40; i++){
            if(e.getSource()==this.cards[i]){
                controller.setCardRequest(i);
                updateUI();
            }
        }
        
        /*
        if(e.getSource()==this.cards[0]){
            //Karte mit Index 0 ausgewählt 
        } else if( e.getSource()==this.cards[0]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[1]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[2]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[3]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[4]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[5]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[6]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[7]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[8]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[9]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[10]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[11]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[12]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[13]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[14]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[15]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[16]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[17]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[18]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[19]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[20]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[21]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[22]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[23]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[24]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[25]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[26]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[27]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[28]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[29]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[30]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[31]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[32]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[33]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[34]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[35]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[36]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[37]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[38]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[39]){
            //Karte mit Index....
        }else if( e.getSource()==this.cards[40]){
            //Karte mit Index....
        }
            
            */
    }

    public Dimension getPreferredSize() {
        return new Dimension(250, 200);
    }
}
