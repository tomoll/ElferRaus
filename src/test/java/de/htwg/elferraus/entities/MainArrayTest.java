
package de.htwg.elferraus.entities;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class MainArrayTest {
    
    MainArray array;

    @Before
    public void setUp() throws Exception {
        array = new MainArray();
    }
 
    
    @Test
    public void testgetHigh() {
        Card card1 = new Card(12,"y");
        array.setHigh(card1);
        assertEquals(12, array.getHigh("y"));

    }
    @Test
    public void testgetLow() {
        Card card2 = new Card(10,"r");
        array.setLow(card2);
        assertEquals(10, array.getLow("r"));

    }
   
    
}
