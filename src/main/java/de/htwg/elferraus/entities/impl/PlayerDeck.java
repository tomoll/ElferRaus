package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.IPlayerDeck;
import de.htwg.elferraus.entities.impl.Card;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class PlayerDeck implements IPlayerDeck {

    private List<Card> playerDeck = new ArrayList<Card>(80);

    public int getSize() {
        return playerDeck.size();
    }

    public Card indexToCard(int i) {  
        return playerDeck.get(i-1);
    }

    public Card popplCard(Card c) {
        if (playerDeck.remove(c)) {
            return c;
        } else {
            return null;
        }
    }

    public void addCard(Card c) {
        playerDeck.add(c);
    }

    @Override
    public String toString() {
        //returns a String with all the Cards from the Player
        String s = "Deine Karten\n";
        int i = 1;
        s = s + "Index\t Farbe\t Nummer\n";
        for (Card c : this.playerDeck) {
            if (c != null) {
                s = s + i + "\t" + c.getColour() + "\t" + c.getNumber() + "\n";
            }
            i++;
        }
        return s;

    }
}
