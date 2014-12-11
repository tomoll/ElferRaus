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
        hans = new ElferRausController(2, new MainArray(), new MainStack());
    }
    //keine Ahnung wie test für die Sachen schreiben 

    @Test
    public void testsetCard() {
        //muss immer zuerst n 11er angelegt werden asnosnten fehler!!!
        //playTabel passt auch schon!!!
        assertTrue(hans.player[0].setCard(new Card(11, "b"), "b"));
        assertFalse(hans.player[0].setCard(new Card(9, "b"), "b"));
        assertTrue(hans.player[0].setCard(new Card(12, "b"), "b"));
        assertTrue(hans.player[0].setCard(new Card(10, "b"), "b"));
        assertFalse(hans.player[0].setCard(new Card(15, "b"), "b"));
        assertTrue(hans.player[1].setCard(new Card(13,"b"), "b"));
        assertTrue(hans.player[1].setCard(new Card(14,"b"), "b"));
        assertTrue(hans.player[0].setCard(new Card(15, "b"), "b"));
        assertEquals(20, hans.player[0].deck.getSize());

    }

    @Test
    public void testgetCard() {
        //geht auch jetz tschon mit 2 Spielern also in Bezug auf stack und playTable
        assertEquals(40, hans.player[0].stack.getAmount());
        assertTrue(20 == hans.player[0].deck.getSize());
        hans.player[0].getCard();
        assertTrue(21 == hans.player[0].deck.getSize());
        hans.player[0].getCard();
        assertTrue(22 == hans.player[0].deck.getSize());
        hans.player[0].getCard();
        assertTrue(23 == hans.player[0].deck.getSize());
        hans.player[0].getCard();
        assertTrue(23 == hans.player[0].deck.getSize());
        assertEquals(37, hans.player[0].stack.getAmount());
        hans.player[1].getCard();
        assertTrue(21 == hans.player[1].deck.getSize());
    }

}
