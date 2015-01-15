package de.htwg.elferraus.controller;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.htwg.elferraus.ElferRausModule;
import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.impl.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Tobi
 */
public class ElferRausControllerTest {

    /**
     *
     */
    public ElferRausControllerTest() {
    }
    ElferRausController hans;
    Injector injector = Guice.createInjector(new ElferRausModule());

    /**
     *
     */
    @Before
    public void setUp() {
        
        hans = new ElferRausController();
        hans.setInjector(injector);
        hans.setPlayer(2);
    }

    /**
     *
     */
    @Test
    public void testcreate() {
        hans.setPlayer(2);
        hans.create();
        assertEquals("Welcome to ElferRaus\n", hans.getStatusMessage());
    }

    /**
     *
     */
    @Test
    public void teststartGame() {
        hans.startGame();
        assertNotNull(hans.getActualPlayer());
        assertNotNull(hans.getStatusMessage());

    }

    /**
     *
     */
    @Test
    public void testnext() {
        assertTrue(hans.next());
        for (int i = 20; i > 0; i--) {
            hans.getActualPlayer().cardToIndex(i);
        }
        assertFalse(hans.next());
        assertNotNull(hans.getStatusMessage());
    }

    /**
     *
     */
    @Test
    public void testsetEndRound() {
        assertFalse(hans.setEndRound());
        hans.getActualPlayer().addCardtoHand(new Card(11, "b"));
        hans.setCardRequest(21);
        assertTrue(hans.setEndRound());
    }

    /**
     *
     */
    @Test
    public void testsetCardRequest() {
        assertFalse(hans.setCardRequest(30));
        assertFalse(hans.setCardRequest(20));
        hans.getActualPlayer().addCardtoHand(new Card(11, "b"));
        assertTrue(hans.setCardRequest(21));
    }

    /**
     *
     */
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

        hans = new ElferRausController();
        hans.setInjector(injector);
        
        
        
        
//        hans.setPlayer(2);
//        while (hans.getActualPlayer().stackSize() > 0) {
//            hans.getActualPlayer().takeCard();
//        }
//        assertFalse(hans.getCardRequest());
//        
//        
//        hans = new ElferRausController();
//        hans.setInjector(injector);
//        hans.setPlayer(2);
//        for ( int i = hans.getActualPlayer().stackSize(); i > 0; i--) {
//            hans.setCardRequest(i);
//        }
//        assertFalse(hans.getCardRequest());
//        

    }

    /**
     *
     */
    @Test
    public void testgetMainString() {
        assertNotNull(hans.getMainString());
    }

    /**
     *
     */
    @Test
    public void testgetStatusMessage() {
        assertNotNull(hans.getStatusMessage());
    }

    /**
     *
     */
    @Test
    public void testgiveCards() {
        hans = new ElferRausController();
        hans.setInjector(injector);
        hans.setPlayer(2);
        
        hans = new ElferRausController();
        hans.setInjector(injector);
        hans.setPlayer(3);
        
        hans = new ElferRausController();
        hans.setInjector(injector);
        hans.setPlayer(4);
        
        hans = new ElferRausController();
        hans.setInjector(injector);
        hans.setPlayer(5);
        
        hans = new ElferRausController();
        hans.setInjector(injector);
        hans.setPlayer(6);
        
        
        
    }
    
    @Test
    public void testgetIntPlayer(){
        int i = hans.getIntPlayer();
        assertEquals(2,i);
    }
    
    

}
