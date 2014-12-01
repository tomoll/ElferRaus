
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
        Card redEleven = new Card(11,"r");
        array.setEleven(redEleven);
    }
 
    
    @Test
    public void testgetHigh() {
        Card card1 = new Card(12,"r");
        array.setHigh(card1);
        assertEquals(card1, array.getHigh("r"));

    }
    @Test
    public void testgetLow() {
        Card card2 = new Card(10,"r");
        array.setLow(card2);
        assertEquals(card2, array.getLow("r"));

    }

        
    
    /*@Test
    public void testColourStrToInt() {
        assertEquals(4, array.ColourStrToInt("y"));
    }*/
   
    
}
