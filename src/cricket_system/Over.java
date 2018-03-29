package cricket_system;

public class Over {
	
	private int[] balls;
	private int currball = 0;
	public Over() {
		balls = new int[6];
		for(int i=0; i<6; i++){
			balls[i]=0;
		}
	}
	
	public int getCurrentBall() {
		return currball;
	}
	
	public int[] getBalls() {
		return balls;
	}
	
	public int getScoreAtBall(int i){
		return balls[i];
	}
	
	public void setScoreAtBall(int i, int score){
		balls[i] = score;
	}
	
	public void addScore(int score){
		if(currball<6){
			balls[currball] = score;
			currball++;
		}
	}
}



