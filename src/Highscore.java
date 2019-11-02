
public class Highscore {
	private static final int MAX_HIGHSCORE = 1000;
	private static final double BEST_SCORE = 21;
	
	private int score;
	private String name;
	
	public Highscore() {
		score = 0;
		name = "";
	}
	
	public Highscore(int tScore, String tName) {
		score = tScore;
		name = tName;
	}
	
	public static int convertScore(int tScore) {
		double score;
		int realScore;
		score = (BEST_SCORE / tScore) * MAX_HIGHSCORE;
		realScore = (int) Math.round(score);
		
		System.out.println("Your score is " + realScore);
		
		return realScore;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setScore(int tScore) {
		score = tScore;
	}
	
	public void setName(String tName) {
		name = tName;
	}

}
