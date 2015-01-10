package de.htwg.elferraus.entities;

import de.htwg.elferraus.entities.impl.MainStack;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.Card;
import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.impl.Waiting;
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
        hans = new ElferRausController();
        hans.setPlayer(2);
    }

    @Test
    public void testsetCard() {

        assertFalse(hans.getActualPlayer().setCard(new Card(9, "b")));
        assertTrue(hans.getActualPlayer().setCard(new Card(11, "b")));
        assertFalse(hans.getActualPlayer().setCard(new Card(9, "b")));
        assertTrue(hans.getActualPlayer().setCard(new Card(10, "b")));
        assertFalse(hans.getActualPlayer().setCard(new Card(13, "b")));
        assertTrue(hans.getActualPlayer().setCard(new Card(12, "b")));
    }

    @Test
    public void testgetCard() {
        assertTrue(hans.getActualPlayer().getCard());
    }
    
    @Test
    public void testsetState(){
        assertTrue(hans.getActualPlayer().setState(new Waiting()));
    }

}
