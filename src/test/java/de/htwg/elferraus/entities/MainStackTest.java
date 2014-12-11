
package de.htwg.elferraus.entities;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class MainStackTest {
    
    MainStack stack;
    @Before
    public void setUp() throws Exception {
        stack = new MainStack();
    }
    
    @Test
    public void testgetAmount() {
        assertEquals(80,stack.getAmount());
        Card c = stack.popCard();
        assertEquals(79,stack.getAmount());
    }
    
    @Test
    public void testpopCard() {
        assertEquals(80, stack.getAmount());
        Card x = stack.popCard();
        Card d = stack.popCard();
        
        assertEquals("b", d.getColour());
        assertEquals(19, d.getNumber());
    }
    
    @Test
    public void testmixCards(){
        Card c = stack.popCard();
        assertEquals(20,c.getNumber());
        assertEquals("b", c.getColour());
        stack.mixCards();
        c = stack.popCard();
        assertFalse(19 == c.getNumber());
        
    }
    
    
}
