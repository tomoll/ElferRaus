/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.controller;

import de.htwg.elferraus.entities.MainArray;
import de.htwg.elferraus.entities.MainStack;
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
        
    }

    @Test
    public void testsetEndRound(){
        
    }

    @Test
    public void testgetCardRequest(){
        
    }

    @Test
    public void testcurrentPlayerString(){
        
    }

}
