/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.util.observer;

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
public class ObservableTest {
    
    public ObservableTest() {
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
     * Test of addObserver method, of class Observable.
     */
    @Test
    public void testAddObserver() {
        System.out.println("addObserver");
        IObserver s = null;
        Observable instance = new Observable();
        instance.addObserver(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeObserver method, of class Observable.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        IObserver s = null;
        Observable instance = new Observable();
        instance.removeObserver(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllObservers method, of class Observable.
     */
    @Test
    public void testRemoveAllObservers() {
        System.out.println("removeAllObservers");
        Observable instance = new Observable();
        instance.removeAllObservers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyObservers method, of class Observable.
     */
    @Test
    public void testNotifyObservers() {
        System.out.println("notifyObservers");
        Observable instance = new Observable();
        instance.notifyObservers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
