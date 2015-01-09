/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.IStates;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tobi
 */
public class PlayerIT {
    
    public PlayerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setCard method, of class Player.
     */
    @Test
    public void testSetCard() {
        System.out.println("setCard");
        Card chosenCard = null;
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.setCard(chosenCard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class Player.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class Player.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        IStates s = null;
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.setState(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
