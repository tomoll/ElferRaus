
package de.htwg.elferraus.entities;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class PlayerDeckTest {
    
    PlayerDeck deck;
    
    @Before
    public void setUp() throws Exception {
        deck = new PlayerDeck(20);
    }
    
   
    @Test
    public void testGetSize() {
        assertEquals(10, deck.getSize());
    }

    @Test
    public void testpopplCard() {
        Card c = new Card(2,"r");
        deck.addCard(c);
        assertEquals(c,deck.popplCard(0));
       
        
        
    }
    

}
