
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
        Card d = new Card(19, "y");
        assertEquals(d,stack.popCard());
    }
    
    
}
