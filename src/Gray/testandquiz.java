package Gray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class testandquiz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				Random rand = new Random();
	
		String options[]= {"Rock","Paper","Scissor"};
		int score=0;
	
		for(int i=0;i<3;i++) {
			System.out.println("Rock,paper,or scissors?");
			String useranswer= reader.readLine();
			int randNumber = rand.nextInt(3);
			System.out.println("Computer choose: "+options[randNumber]);
			
			if(useranswer.compareTo(options[0])==0) {
				if(randNumber==0) {
					System.out.println("Draw.");
				}
				if(randNumber==1) {
					System.out.println("Computer won");
				}if(randNumber==2) {
					System.out.println("You won");
					score++;
				}
			}
			if(useranswer.compareTo(options[1])==0) {
				if(randNumber==0) {
					System.out.println("You won");
					score++;
				}
				if(randNumber==1) {
					System.out.println("Draw.");
				}if(randNumber==2) {
					System.out.println("Computer won");
				}

			}
			if(useranswer.compareTo(options[2])==0) {
				if(randNumber==0) {
					System.out.println("Computer won");
				}
				if(randNumber==1) {
					System.out.println("You won");
					score++;
				}if(randNumber==2) {
					System.out.println("Draw.");
				}
				

			}

		} System.out.println(score);

	}

}
