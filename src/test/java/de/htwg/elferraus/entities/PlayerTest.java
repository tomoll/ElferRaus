package de.htwg.elferraus.entities;

import de.htwg.elferraus.controller.ElferRausController;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Tobi
 */
public class PlayerTest {

    public PlayerTest() {
    }
    //Player player;
    ElferRausController hans;

    @Before
    public void setUp() {
        hans = new ElferRausController(1, new MainArray(), new MainStack());
    }
   //keine Ahnung wie test für die Sachen schreiben 

    @Test
    public void testsetCard() {
        assertTrue(hans.player[0].setCard(new Card(11, "b"), "b"));
        //assertFalse(hans.player[0].setCard(new Card(9, "b"), "b"));
        //assertEquals(true, hans.player[0].setCard(new Card(12, "b"), "b"));
        //assertEquals(true, hans.player[0].setCard(new Card(10, "b"), "b"));
        //assertEquals(false, hans.player[0].setCard(new Card(15, "b"), "b"));
        //assertEquals(20, hans.player[0].deck.getSize());

    }

    @Test
    public void testgetCard() {
        assertTrue(20 == hans.player[0].deck.getSize());
        hans.player[0].getCard();
        assertTrue(21 == hans.player[0].deck.getSize());    
        hans.player[0].getCard();
        assertTrue(22 == hans.player[0].deck.getSize());
        hans.player[0].getCard();
        assertTrue(23 == hans.player[0].deck.getSize());
        hans.player[0].getCard();
        assertTrue(23 == hans.player[0].deck.getSize());
    }

}
