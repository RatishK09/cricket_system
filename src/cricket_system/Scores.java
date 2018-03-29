package cricket_system;

public class Scores {

	private Match match;
	private int totalScore=0;

	public Scores(Match match1) {
		match = match1;
	}

	public void addScore(int score) {
		if(score<=6 && score>=0)
		totalScore += match.addScore(score);
	}
	
	public int getCurrentScore(){
		return totalScore;
	}
	
	public int getScoreInOver(int over){
		Over o = match.getOverAt(over);
		int score = 0;
		for(int i=0; i<o.getCurrentBall();i++){
			score += o.getScoreAtBall(i);
		}
		return score;
	}
	
	public int getTotalScore(){
		return totalScore;
	}
	

}
