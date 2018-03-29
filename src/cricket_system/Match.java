package cricket_system;

public class Match {
	private String team1, team2;
	private int totalOvers = 0;
	private int currover = 0;
	
	private Over[] overs;  //array to sore number of overs
	
	
	public Match(String t1, String t2, int o) {
		team1 = t1;
		team2 = t2;
		totalOvers = o;
		overs = new Over[totalOvers];
		for(int i=0; i<totalOvers; i++){
			overs[i]= new Over();
		}
	}
	
	public int getOvers() {
		return totalOvers;
	}
	
	public Over getOverAt(int i) {
		return overs[i];
	}
	
	public String getTeam1() {
		return team1;
	}
	public String getTeam2() {
		return team2;
	}
	
	public int addScore(int score){
		int s=0;
		if(currover<totalOvers){
			overs[currover].addScore(score);
			if(overs[currover].getCurrentBall()==6){
				currover++;
			}
			s=score;
		}
		return s;
	}
	
	public int getCurrentOver() {
		return currover;
	}
	
	public int getCurrentOverBall() {
		return overs[currover].getCurrentBall();
	}
}
