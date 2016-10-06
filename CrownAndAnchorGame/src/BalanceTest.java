import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BalanceTest {

	Dice d1, d2, d3;
	Player player;
	Game game;
	List<DiceValue> cdv;
	
	@Before
	public void setUp() throws Exception {
		d1 = new Dice();
        d2 = new Dice();
	    d3 = new Dice();

	    player = new Player("Fred", 100);
	    game = new Game(d1, d2, d3);
	    cdv = game.getDiceValues();

	}

	@Test
	public void test() {
	
		String name = "Fred";
    	int balance = 100;
    	int limit = 0;
        player = new Player(name, balance);
        player.setLimit(limit);
        int bet = 5;

        System.out.println(String.format("%s starts with balance %d, limit %d", 
        		player.getName(), player.getBalance(), player.getLimit()));

        DiceValue pick = DiceValue.getRandom();
        
    	System.out.printf(" %s bet %d on %s\n",
    			player.getName(), bet, pick); 
    	
    	int winnings = game.playRound(player, pick, bet);
        cdv = game.getDiceValues();
        
        System.out.printf("Rolled %s, %s, %s\n",
        		cdv.get(0), cdv.get(1), cdv.get(2));
        
        if (winnings > 0) {
            System.out.printf("%s won %d, balance now %d\n\n",
            		player.getName(), winnings, player.getBalance());
        }
        else {
            System.out.printf("%s lost, balance now %d\n\n",
            		player.getName(), player.getBalance());
        }

		
	}

}
