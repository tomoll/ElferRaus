/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.tui;

import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Tobi
 */
public class TuiTest {
    
    //private ElferRausController controller;
    Tui tui;
    
    /**
     *
     */
    @Before
    public void testsetUp(){
        tui = new Tui(new ElferRausController());
    }
    
    /**
     *
     */
    @Test
    public void testIterate(){
        //assertFalse(tui.iterate());

    }
    
    /**
     *
     */
    @Test
    public void testprintTUI(){
        //9assertTrue(tui.printTUI());

    }
    
    /**
     *
     */
    @Test 
    public void testHandleInputOrQuit(){
        assertFalse(tui.handleInputOrQuit("7"));
//        assertTrue(tui.handleInputOrQuit("1"));
//        assertTrue(tui.handleInputOrQuit("1"));
//        assertTrue(tui.handleInputOrQuit("1"));
//        assertTrue(tui.handleInputOrQuit("3"));
//        //assertTrue(tui.handleInputOrQuit("4"));
           //assertTrue(tui.handleInputOrQuit("2"));

    }
    
    /**
     *
     */
    @Test
    public void testInitialize(){
        assertTrue(tui.initialize());
        
        
    }

    /**
     *
     */
    @Test
    public void testupdate(){
       //  tui.update();
        
        
    }
    
}
