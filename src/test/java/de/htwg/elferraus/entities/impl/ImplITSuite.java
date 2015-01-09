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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Tobi
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({de.htwg.elferraus.entities.impl.MainStackIT.class, de.htwg.elferraus.entities.impl.MainArrayIT.class, de.htwg.elferraus.entities.impl.PlayingIT.class, de.htwg.elferraus.entities.impl.WaitingIT.class, de.htwg.elferraus.entities.impl.CardIT.class, de.htwg.elferraus.entities.impl.PlayerIT.class, de.htwg.elferraus.entities.impl.PlayerDeckIT.class})
public class ImplITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
