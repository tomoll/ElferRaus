
package de.htwg.elferraus.entities;


import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class MainArrayTest {
    
    MainArray array;

    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        array = new MainArray();
        Card redEleven = new Card(11,"r");
        array.setEleven(redEleven);
        array.setEleven(new Card(11,"g"));
        array.setEleven(new Card(11,"y"));
    }
 
    /**
     *
     */
    @Test
    public void testgetHigh() {
        Card card1 = new Card(12,"r");
        array.setHigh(card1);
        assertEquals(card1, array.getHigh("r"));
        assertNotNull(array.getHigh("r"));

    }

    /**
     *
     */
    @Test
    public void testgetLow() {
        Card card2 = new Card(10,"r");
        array.setLow(card2);
        assertEquals(card2, array.getLow("r"));
        assertNotNull(array.getLow("r"));

    }
    
    /**
     *
     */
    @Test 
    public void testisNotEmpty(){
        assertTrue(array.isNotEmpty("y"));
        assertFalse(array.isNotEmpty("b"));
    }
    
    /**
     *
     */
    @Test 
    public void testtoString(){
        assertNotNull(array.toString());
        array.setLow(new Card(10,"r"));
        assertNotNull(array.toString());
        array.setHigh(new Card(12,"r"));
        assertNotNull(array.toString());
    }

   
}
