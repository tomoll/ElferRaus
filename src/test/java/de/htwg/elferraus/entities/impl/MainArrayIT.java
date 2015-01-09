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
public class MainArrayIT {
    
    public MainArrayIT() {
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
     * Test of setHigh method, of class MainArray.
     */
    @Test
    public void testSetHigh() {
        System.out.println("setHigh");
        Card c = null;
        MainArray instance = new MainArray();
        instance.setHigh(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLow method, of class MainArray.
     */
    @Test
    public void testSetLow() {
        System.out.println("setLow");
        Card c = null;
        MainArray instance = new MainArray();
        instance.setLow(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHigh method, of class MainArray.
     */
    @Test
    public void testGetHigh() {
        System.out.println("getHigh");
        String colour = "";
        MainArray instance = new MainArray();
        Card expResult = null;
        Card result = instance.getHigh(colour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLow method, of class MainArray.
     */
    @Test
    public void testGetLow() {
        System.out.println("getLow");
        String colour = "";
        MainArray instance = new MainArray();
        Card expResult = null;
        Card result = instance.getLow(colour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEleven method, of class MainArray.
     */
    @Test
    public void testSetEleven() {
        System.out.println("setEleven");
        Card eleven = null;
        MainArray instance = new MainArray();
        instance.setEleven(eleven);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNotEmpty method, of class MainArray.
     */
    @Test
    public void testIsNotEmpty() {
        System.out.println("isNotEmpty");
        String colour = "";
        MainArray instance = new MainArray();
        boolean expResult = false;
        boolean result = instance.isNotEmpty(colour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MainArray.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MainArray instance = new MainArray();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
