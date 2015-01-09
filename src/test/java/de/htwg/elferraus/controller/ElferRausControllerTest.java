/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.controller;

import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.impl.Card;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;
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
        hans = new ElferRausController(2, new MainArray(), new MainStack(false));
    }

    @Test
    public void testnext() {
        assertTrue(hans.next());
        for (int i = 20; i > 0; i--) {
            hans.player[1].deck.popplCard(hans.player[1].deck.indexToCard(i));
        }
        assertFalse(hans.next());
    }

    @Test
    public void testsetEndRound() {
        assertFalse(hans.setEndRound());
        hans.player[0].deck.addCard(new Card(11, "b"));
        hans.setCardRequest(21);
        assertTrue(hans.setEndRound());
    }

    @Test
    public void testsetCardRequest() {
        assertFalse(hans.setCardRequest(30));
        assertFalse(hans.setCardRequest(20));
        hans.player[0].deck.addCard(new Card(11, "b"));
        assertTrue(hans.setCardRequest(21));
    }

    @Test
    public void testgetCardRequest() {
        assertTrue(hans.getCardRequest());
        hans.getCardRequest();
        hans.getCardRequest();
        assertFalse(hans.getCardRequest());
        while (hans.player[0].stack.getAmount() > 0) {
            hans.player[1].stack.popCard();
        }
        hans.next();
        assertFalse(hans.getCardRequest());

    }

    @Test
    public void testcurrentPlayerString() {
        assertNotNull(hans.currentPlayerString());

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
