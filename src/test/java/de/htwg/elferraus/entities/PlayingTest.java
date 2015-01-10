
package de.htwg.elferraus.entities;


import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;
import de.htwg.elferraus.entities.impl.Player;
import de.htwg.elferraus.entities.impl.Playing;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class PlayingTest {

    Playing test;
    @Before
    public void setUp() throws Exception{
        test = new Playing();
    }

    @Test
    public void testnext() {
         assertEquals(0, test.next(new Player(new MainArray(), new MainStack()), 1, 2));
         assertEquals(1, test.next(new Player(new MainArray(), new MainStack()), 0, 2));
    }
    

}
