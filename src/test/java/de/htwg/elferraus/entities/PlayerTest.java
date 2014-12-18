package de.htwg.elferraus.entities;

import de.htwg.elferraus.entities.impl.MainStack;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.Card;
import de.htwg.elferraus.controller.impl.ElferRausController;
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
        hans = new ElferRausController(2, new MainArray(), new MainStack(false));
    }
    //keine Ahnung wie test für die Sachen schreiben 

    @Test
    public void testsetCard() {
        //muss immer zuerst n 11er angelegt werden asnosnten fehler!!!
        //playTabel passt auch schon!!!
       /* assertTrue(hans.player[0].setCard(new Card(11, "b")));
        assertFalse(hans.player[0].setCard(new Card(9, "b")));
        assertTrue(hans.player[0].setCard(new Card(12, "b")));
        assertTrue(hans.player[0].setCard(new Card(10, "b")));
        assertFalse(hans.player[0].setCard(new Card(15, "b")));
        assertTrue(hans.player[1].setCard(new Card(13,"b")));
        assertTrue(hans.player[1].setCard(new Card(14,"b")));
        assertTrue(hans.player[0].setCard(new Card(15, "b")));
        assertEquals(20, hans.player[0].deck.getSize());
        //assertFalse(hans.player[0].setCard(new Card(16, "c"), "c")); geht nicht!!!!
        assertFalse(hans.player[0].setCard(new Card(16, "c")));
*/
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
        
        hans.player[0].setCard(new Card(11, "b"));
        assertFalse(hans.player[0].getCard());
        
        
        for(int i = 0; i < hans.player[0].stack.getAmount();i++){
            hans.player[0].getCard();
        }
        assertFalse(hans.player[0].getCard());
        
    }

}
