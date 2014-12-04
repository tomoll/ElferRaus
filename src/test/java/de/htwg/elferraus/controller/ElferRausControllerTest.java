/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.controller;


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
    ElferRausController elfer;
  
    @Before
    public void setUp() {
        elfer = new ElferRausController();       
    }
   

    @Test
    public void testround() {
       // assertEquals(3,elfer.a);
        elfer.round();
        //assertEquals(4,elfer.a);
    
    }
    
}
