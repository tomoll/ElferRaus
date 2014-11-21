
package de.htwg.elferraus.entities;
import de.htwg.elferraus.*;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class CardTest {

    
    Card card;
    
    @Before
    public void setUp() throws Exception{
        card = new Card(1, "y");
    }

    @Test
    public void testGetNumber() {
        assertEquals(2, card.getNumber());
    }

    @Test
    public void testGetColour() {
         assertEquals("r", card.getColour());
    }

}
