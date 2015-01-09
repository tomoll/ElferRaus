
package de.htwg.elferraus.entities;


import de.htwg.elferraus.entities.impl.MainStack;
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
        stack = new MainStack(false);
    }
    
    @Test
    public void testgetAmount() {
        assertEquals(80,stack.getAmount());
        ICard c = stack.popCard();
        assertEquals(79,stack.getAmount());
    }
    
    @Test
    public void testpopCard() {
        assertEquals(80, stack.getAmount());
        ICard x = stack.popCard();
        ICard d = stack.popCard();
        
        assertEquals("b", d.getColour());
        assertEquals(19, d.getNumber());
    }
    
    @Test
    public void testmixCards(){
        ICard c = stack.popCard();
        assertEquals(20,c.getNumber());
        assertEquals("b", c.getColour());

        
    }
    
    
}
