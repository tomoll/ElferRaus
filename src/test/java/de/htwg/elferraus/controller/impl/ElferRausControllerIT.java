/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.controller.impl;

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
public class ElferRausControllerIT {
    
    public ElferRausControllerIT() {
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
     * Test of next method, of class ElferRausController.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        ElferRausController instance = null;
        boolean expResult = false;
        boolean result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndRound method, of class ElferRausController.
     */
    @Test
    public void testSetEndRound() {
        System.out.println("setEndRound");
        ElferRausController instance = null;
        boolean expResult = false;
        boolean result = instance.setEndRound();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCardRequest method, of class ElferRausController.
     */
    @Test
    public void testSetCardRequest() {
        System.out.println("setCardRequest");
        int next = 0;
        ElferRausController instance = null;
        boolean expResult = false;
        boolean result = instance.setCardRequest(next);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardRequest method, of class ElferRausController.
     */
    @Test
    public void testGetCardRequest() {
        System.out.println("getCardRequest");
        ElferRausController instance = null;
        boolean expResult = false;
        boolean result = instance.getCardRequest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of currentPlayerString method, of class ElferRausController.
     */
    @Test
    public void testCurrentPlayerString() {
        System.out.println("currentPlayerString");
        ElferRausController instance = null;
        String expResult = "";
        String result = instance.currentPlayerString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMainString method, of class ElferRausController.
     */
    @Test
    public void testGetMainString() {
        System.out.println("getMainString");
        ElferRausController instance = null;
        String expResult = "";
        String result = instance.getMainString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatusMessage method, of class ElferRausController.
     */
    @Test
    public void testGetStatusMessage() {
        System.out.println("getStatusMessage");
        ElferRausController instance = null;
        String expResult = "";
        String result = instance.getStatusMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
