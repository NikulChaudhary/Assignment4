/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    public void testCheckBet() {
        Player player = new Player("Fred",100);
        int betAmount = 10;
        boolean expResult = true;
        boolean result = player.checkBet(betAmount);
        assertEquals(expResult, result); 
        
    }
    
}
