package de.htwg.elferraus.entities;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.htwg.elferraus.ElferRausModule;
import de.htwg.elferraus.entities.impl.Card;
import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.impl.Waiting;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Tobi
 */
public class PlayerTest {

    
        Injector injector = Guice.createInjector(new ElferRausModule());
        
    /**
     *
     */
    public PlayerTest() {
    }
    //Player player;
    ElferRausController hans;

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
    public void testsetCard() {

        assertFalse(hans.getActualPlayer().setCard(new Card(9, "b")));
        assertTrue(hans.getActualPlayer().setCard(new Card(11, "b")));
        assertFalse(hans.getActualPlayer().setCard(new Card(9, "b")));
        assertTrue(hans.getActualPlayer().setCard(new Card(10, "b")));
        assertFalse(hans.getActualPlayer().setCard(new Card(13, "b")));
        assertTrue(hans.getActualPlayer().setCard(new Card(12, "b")));
    }

    /**
     *
     */
    @Test
    public void testgetCard() {
        assertTrue(hans.getActualPlayer().getCard());
    }
    
    /**
     *
     */
    @Test
    public void testsetState(){
        assertTrue(hans.getActualPlayer().setState(new Waiting()));
    }

    @Test
    public void testgetTable() {
        HashMap<Integer, HashMap<String, Integer>> temp = new HashMap<Integer, HashMap<String, Integer>>();
        temp = hans.getActualPlayer().getTable();
        assertNotNull(temp);
    }
    
    @Test
    public void testgetHand(){
        HashMap<Integer, HashMap<String, Integer>> temp = new HashMap<Integer, HashMap<String, Integer>>();
        temp = hans.getActualPlayer().getHand();
        assertNotNull(temp);
        
        
    }
}
