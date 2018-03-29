import static org.junit.Assert.*;

import org.junit.Test;

public class Add_Score {

	Cricket_Match matchInn1;
	Score score;
	
	@Test
	public void test() {
		matchInn1 = new Cricket_Match("Srilanka","England",5);
		score = new Score(matchInn1);
		score.addScore(1);
		score.addScore(2);
		assertEquals(3, score.getCurrentScore());
	}

}