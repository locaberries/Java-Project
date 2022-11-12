package Gray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Put one number");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x;
		x=Integer.parseInt(reader.readLine());
		x= multiply(x);
		System.out.println(x);
		
	} 
	public static int multiply(int answer) {
		return answer * 10; 
		
	}
}
