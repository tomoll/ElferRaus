package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.ICard;
import de.htwg.elferraus.entities.IPlayerDeck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Tobi
 */
public class PlayerDeck implements IPlayerDeck {
    
    

    private static final int PLAYERDECKSIZE = 80;
    private ArrayList<ICard> playerDeck = new ArrayList<ICard>(PLAYERDECKSIZE);

    /**
     *
     * @return
     */
    public int getSize() {
        return playerDeck.size();
    }

    /**
     *
     * @param i
     * @return
     */
    public ICard indexToCard(int i) {  
        return playerDeck.get(i-1);
    }

    /**
     *
     * @param c
     * @return
     */
    public ICard popplCard(ICard c) {
        if (playerDeck.remove(c)) {
            return c;
        } else {
            return null;
        }
    }

    /**
     *
     * @param c
     */
    public void addCard(ICard c) {
        playerDeck.add(c);
    }
    
    public ArrayList<ICard> getCards(){
        return playerDeck;        
    }

    @Override
    public String toString() {
        String s = "Your Cards\n";
        int i = 1;
        s = s + "Index\t Colour\t Number\n";
        for (ICard c : this.playerDeck) {
                s = s + i + "\t" + c.getColour() + "\t" + c.getNumber() + "\n";
            i++;
        }
        return s;

    }
}
