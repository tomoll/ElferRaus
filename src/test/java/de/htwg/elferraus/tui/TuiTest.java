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
    
    Tui tui;
    
    @Before
    public void testsetUp(){
        tui = new Tui(new ElferRausController(2, new MainArray(), new MainStack(true)));
    }
    
    @Test
    public void testIterate(){

    }
    
    @Test
    public void testPrintTui(){
        
    }
    
    @Test 
    public void testHandleInputOrQuit(){

    }
    
    @Test
    public void testUpdate(){
        
    }
}
