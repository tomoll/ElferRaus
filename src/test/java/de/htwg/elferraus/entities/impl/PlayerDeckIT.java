/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.entities.impl;

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
public class PlayerDeckIT {
    
    public PlayerDeckIT() {
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
     * Test of getSize method, of class PlayerDeck.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        PlayerDeck instance = new PlayerDeck();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexToCard method, of class PlayerDeck.
     */
    @Test
    public void testIndexToCard() {
        System.out.println("indexToCard");
        int i = 0;
        PlayerDeck instance = new PlayerDeck();
        Card expResult = null;
        Card result = instance.indexToCard(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of popplCard method, of class PlayerDeck.
     */
    @Test
    public void testPopplCard() {
        System.out.println("popplCard");
        Card c = null;
        PlayerDeck instance = new PlayerDeck();
        Card expResult = null;
        Card result = instance.popplCard(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class PlayerDeck.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card c = null;
        PlayerDeck instance = new PlayerDeck();
        instance.addCard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PlayerDeck.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PlayerDeck instance = new PlayerDeck();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
