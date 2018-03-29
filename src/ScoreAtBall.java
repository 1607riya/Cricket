import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreAtBall {

	Cricket_Match matchInn1;
	Score score;
	
	@Test
	public void test() {
		matchInn1 = new Cricket_Match("Srilanka","England",10);
		score = new Score(matchInn1);
		score.addScore(1);
		score.addScore(2);
		assertEquals(2, score.getScoreInOverInBall(1,2));
	}

}