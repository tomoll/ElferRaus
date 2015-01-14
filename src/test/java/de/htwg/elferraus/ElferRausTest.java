package de.htwg.elferraus;

import de.htwg.elferraus.tui.Tui;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tobi
 */
public class ElferRausTest {

    private Tui tui;
    private ElferRaus instance;

    /**
     *
     */
    @Before
    public void setUp() {
        instance = ElferRaus.getInstance();
    }

    /**
     *
     */
    @Test
    public void testgetInstance() {
        assertTrue(instance instanceof ElferRaus);
    }
  
    

    
    
    

}
