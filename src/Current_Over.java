import static org.junit.Assert.*;

import org.junit.Test;

public class Current_Over {

	Cricket_Match matchInn1;
	Score score;
	
	@Test
	public void test() {
		System.out.println("Srilanka v/s England: 10 overs match");
		matchInn1 = new Cricket_Match("Srilanka","England",10);
		score = new Score(matchInn1);
		score.addScore(4);
		score.addScore(6);
		score.addScore(2);
		score.addScore(4);
		score.addScore(6);
		score.addScore(4);
		
		score.addScore(2);
		score.addScore(2);
		score.addScore(0);
		score.addScore(4);
		assertEquals(2, matchInn1.getCurrentOver()+1);
	}

}