import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author baris
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testPlayRound() {  // test the defect of original code
        Player player = new Player("Fred",100);
        DiceValue pick = DiceValue.CROWN;
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice d3 = new Dice();
        int bet = 5;
        int bet1 = 100;
        Game instance = new Game(d1,d2,d3);
        int expResult = instance.playRound(player, pick, bet);
        int result = instance.playRound(player, pick, bet1);
        System.out.println(result);
        assertEquals(expResult, result);   
    }   
}
