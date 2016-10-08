/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

    /**
     * Test of playRound method, of class Game.
     */
    @Test
    public void testPlayRound() {
        
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
