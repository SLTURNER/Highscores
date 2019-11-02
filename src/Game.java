import java.util.Scanner;

public class Game {
	private final int HIGH_SCORES = 10;
	private Highscore[] scores = new Highscore[HIGH_SCORES];
	private Scanner s = new Scanner(System.in);
	
	public Game() {
		for(int i = 0; i < scores.length; i++) {
			scores[i] = new Highscore(000, "UNKNOWN");
		}
	}

	public static void main(String[] args) {
		Game battleships = new Game();
		Scanner s1 = new Scanner(System.in);
		
		battleships.isHighscore(23);
		
		battleships.displayHighscores();
		
	}
	
	public void isHighscore(int tScore) {
		int index;
		tScore = Highscore.convertScore(tScore);
		
		for(int i = 0; i<scores.length;i++) {
			if(tScore > scores[i].getScore()) {
				index = i;
				setHighscore(index, tScore);
				return;
			}
		}
	}
	
	public void setHighscore(int index, int tScore) {
		
		for(int i = scores.length-1; i > index; i--) {
			scores[i].setScore(scores[i-1].getScore());
			scores[i].setName(scores[i-1].getName());
		}
		
		scores[index].setScore(tScore);
		while(true) {
			System.out.println("Please type your name: ");
			if(s.hasNextLine()) {
				scores[index].setName(s.nextLine());
				return;
			}
			else {
				System.out.println("invalid input");
			}
		}
				
	}
	
	public void displayHighscores() {
		for(Highscore row: scores) {
			System.out.println(row.getName() + "\t" + row.getScore() + "\n");
			
		}
	}

}
