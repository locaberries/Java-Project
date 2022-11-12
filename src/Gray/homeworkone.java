package Gray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homeworkone {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int x, y, c;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two numbers");

		x = Integer.parseInt(reader.readLine());
		y = Integer.parseInt(reader.readLine());

		System.out.println("Pick a choice. 1 is Addition and 2 is Subtraction. 3 is for reenter the number and 4 is to exit the program");

		c= Integer.parseInt(reader.readLine());

		if(c==1) {
		
			System.out.println(x+y);

		}
		
		if(c==2) {
			
			System.out.println(x-y);
			
		}
		
	}
}