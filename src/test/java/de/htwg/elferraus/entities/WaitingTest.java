/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.entities;

import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;
import de.htwg.elferraus.entities.impl.Player;
import de.htwg.elferraus.entities.impl.Playing;
import de.htwg.elferraus.entities.impl.Waiting;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Tobi
 */
public class WaitingTest {
    
    Waiting test;

    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception{
        test = new Waiting();
    }

    /**
     *
     */
    @Test
    public void testnext() {
         assertEquals(1, test.next(new Player(), 1, 2));
         assertEquals(0, test.next(new Player(), 0, 2));
    }

    
}
