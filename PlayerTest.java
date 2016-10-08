import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author baris
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testCheckBet() { // test the bet amount
        Player player = new Player("Fred",100);
        int betAmount = 10;
        boolean expResult = true;
        boolean result = player.checkBet(betAmount);
        assertEquals(expResult, result); 
        
    }   
}
