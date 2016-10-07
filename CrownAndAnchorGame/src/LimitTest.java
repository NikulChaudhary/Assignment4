import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LimitTest {

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
		fail("Not yet implemented");
	}

}
