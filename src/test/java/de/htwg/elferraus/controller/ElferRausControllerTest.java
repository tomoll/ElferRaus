/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.controller;

import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class ElferRausControllerTest {

    public ElferRausControllerTest() {
    }
    ElferRausController hans;

    @Before
    public void setUp() {
        hans = new ElferRausController(2, new MainArray(), new MainStack());
    }

    @Test
    public void testnextPlayer(){
        assertEquals(hans.player[1],hans.nextPlayer(0));
    }

    @Test
    public void testsetEndRound(){
        //assertFalse(hans.setEndRound());
        hans.endRoundAllowed = true;
        //assertTrue(hans.setEndRound());
        
        
        
    }

    @Test
    public void testgetCardRequest(){
        //assertFalse(hans.setCardRequest(1));
        
        
    }

    @Test
    public void testcurrentPlayerString(){
        assertNotNull(hans.currentPlayerString());
        
    }

    @Test
    public void testgetMainString(){
        //assertNotNull(hans.getMainString());
    }
    

}
