package cricket_system;

public class Generatescore {
	
		public static void main(String[] args) {
			Match match = new Match("AUSTRALIA","SOUTHAFRICA",20);
			Scores score = new Scores(match);
			
			score.addScore(4);
			score.addScore(4);
			score.addScore(0);
			score.addScore(1);
			score.addScore(4);
			score.addScore(1);


			try{
			System.out.println("-------------------------------SCORE BOARD---------------------------------");
			System.out.println("__________________________________________________________________________________");
			System.out.println("AUSTRALIA");
			System.out.println("Current Over : "+match.getCurrentOver());
			System.out.println("Current Ball : "+match.getCurrentOverBall());
			System.out.println("Current Over Score: "+score.getCurrentScore());
			System.out.println("__________________________________________________________________________________");
			System.out.println("Total Score : "+score.getCurrentScore());
			System.out.println("__________________________________________________________________________________");
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("----------Printing Error Occured-----------");
		
	}
			

		}}
	

