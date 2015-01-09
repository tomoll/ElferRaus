package de.htwg.elferraus.controller;

import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.impl.Card;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElferRausControllerTest {

    public ElferRausControllerTest() {
    }
    ElferRausController hans;

    @Before
    public void setUp() {
        hans = new ElferRausController(2, new MainArray(), new MainStack(false));
    }

    @Test
    public void testnext() {
        assertTrue(hans.next());
        for (int i = 20; i > 0; i--) {
            hans.getActualPlayer().cardToIndex(i);
        }
        assertFalse(hans.next());
    }

    @Test
    public void testsetEndRound() {
        assertFalse(hans.setEndRound());
        hans.getActualPlayer().addCardtoHand(new Card(11, "b"));
        hans.setCardRequest(21);
        assertTrue(hans.setEndRound());
    }

    @Test
    public void testsetCardRequest() {
        assertFalse(hans.setCardRequest(30));
        assertFalse(hans.setCardRequest(20));
        hans.getActualPlayer().addCardtoHand(new Card(11, "b"));
        assertTrue(hans.setCardRequest(21));
    }

    @Test
    public void testgetCardRequest() {
        assertTrue(hans.getCardRequest());
        hans.getCardRequest();
        hans.getCardRequest();
        assertFalse(hans.getCardRequest());
        while (hans.getActualPlayer().stackSize() > 0) {
            hans.getActualPlayer().takeCard();
        }
        hans.next();
        assertFalse(hans.getCardRequest());
        
        
        hans = new ElferRausController(2, new MainArray(), new MainStack(false));
        while (hans.getActualPlayer().stackSize() > 0) {
            hans.getActualPlayer().takeCard();
        }
        assertFalse(hans.getCardRequest());
        

    }

    @Test
    public void testgetMainString() {
        assertNotNull(hans.getMainString());
    }

    @Test
    public void testgetStatusMessage() {
        assertNotNull(hans.getStatusMessage());
    }

    @Test
    public void testgiveCards() {
        hans = new ElferRausController(4, new MainArray(), new MainStack(false));
        hans = new ElferRausController(5, new MainArray(), new MainStack(false));
        hans = new ElferRausController(6, new MainArray(), new MainStack(false));
        hans = new ElferRausController(6, new MainArray(), new MainStack(false));

    }

}
