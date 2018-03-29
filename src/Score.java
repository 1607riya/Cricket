public class Score {

	private Cricket_Match match;
	private int totalScore = 0;

	public Score(Cricket_Match m) {
		match = m;
	}

	public void addScore(int score) {
		if (score <= 6 && score >= 0)
			totalScore += match.addScore(score);
	}

	public int getCurrentScore() {
		return totalScore;
	}

	public int getScoreInOver(int over) {
		Over o = match.getOverAt(over);
		int s = 0;
		for (int i = 0; i < o.getCurrentBall(); i++) {
			s += o.getScoreAtBall(i);
		}
		return s;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void ShowScore() {
		Test.Log(" -- " + match.getTeam1() + " VS " + match.getTeam2() + " -- ");
		Test.Log("Batting : " + match.getTeam1());
		Test.Log("Current Score : " + totalScore);
		Test.Log("Current Over : " + (match.getCurrentOver() + 1));
		ShowScoreOver();
		Test.Log("Current Over Ball : " + (match.getCurrentOverBall()));
		Test.Log("Total Score : " + totalScore);
	}

	public void ShowScoreOver() {
		int s=0;
		for (int i = 0; i < match.getCurrentOver(); i++) {
			if(match.getOverAt(i).getCurrentBall() > 0){
				Test.Log("Over "+(i+1)+" : ");
				s=0;
				for (int j = 0; j < match.getOverAt(i).getCurrentBall(); j++) {
					s+=match.getOverAt(i).getScoreAtBall(j);
					Test.Log(" "+match.getOverAt(i).getScoreAtBall(j));
				}
				Test.Log(" = "+s);
			}
		}
	}
	
	public int getScoreInOverInBall(int over,int ball){
		over-=1;
		ball-=1;
		Test.Log(match.getOverAt(over).getScoreAtBall(ball)+"");
		return match.getOverAt(over).getScoreAtBall(ball);
	}

}