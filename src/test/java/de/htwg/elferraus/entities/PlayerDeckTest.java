
package de.htwg.elferraus.entities;


import de.htwg.elferraus.entities.impl.Card;
import de.htwg.elferraus.entities.impl.PlayerDeck;
import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class PlayerDeckTest {
    
    PlayerDeck deck;
    
    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        deck = new PlayerDeck();
    }
    
    /**
     *
     */
    @Test
    public void testGetSize() {
        Card a = new Card(3, "r");
        Card b = new Card(4, "r");
        Card f = new Card(3, "y");
        deck.addCard(a);
        deck.addCard(b);
        deck.addCard(f);
        assertEquals(3, deck.getSize());
    }

    /**
     *
     */
    @Test
    public void testpopplCard() {
        Card c = new Card(2,"r");
        deck.addCard(c);
        assertEquals(c,deck.popplCard(c));
        assertEquals(null, deck.popplCard(c));
        
    }
    
    /**
     *
     */
    @Test 
    public void testIndexToCard(){
        Card c = new Card(9,"b");
        deck.addCard(c);
        assertEquals(c,deck.indexToCard(1));
    }
    
    /**
     *
     */
    @Test
    public void testtoString(){
        assertNotNull(deck.toString());
        String s = "Your Cards\n";
        s = s + "Index\t Colour\t Number\n";
        assertEquals(s, deck.toString());
        Card c = new Card(9,"b");
        deck.addCard(c);
        assertNotNull(deck.toString());
        
    }
    
    
    @Test 
    public void testgetCards(){
        ArrayList<ICard> dieter;
        dieter = deck.getCards();
        assertNotNull(dieter);
    }
    

}
