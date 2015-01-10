
package de.htwg.elferraus.entities;


import de.htwg.elferraus.entities.impl.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class CardTest {

    
    Card card;
    
    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception{
        card = new Card(1, "y");
    }

    /**
     *
     */
    @Test
    public void testGetNumber() {
        assertEquals(1, card.getNumber());
    }

    /**
     *
     */
    @Test
    public void testGetColour() {
         assertEquals("y", card.getColour());
    }

}
