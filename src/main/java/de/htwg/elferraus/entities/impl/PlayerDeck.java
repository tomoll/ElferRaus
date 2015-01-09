package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.ICard;
import de.htwg.elferraus.entities.IPlayerDeck;
import java.util.ArrayList;
import java.util.List;

public class PlayerDeck implements IPlayerDeck {
    
    

    private static final int PLAYERDECKSIZE = 80;
    private List<ICard> playerDeck = new ArrayList<ICard>(PLAYERDECKSIZE);

    public int getSize() {
        return playerDeck.size();
    }

    public ICard indexToCard(int i) {  
        return playerDeck.get(i-1);
    }

    public ICard popplCard(ICard c) {
        if (playerDeck.remove(c)) {
            return c;
        } else {
            return null;
        }
    }

    public void addCard(ICard c) {
        playerDeck.add(c);
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
