package Gray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Type in words");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userinput = reader.readLine();
		int length= userinput.length();
		int numberofwords= userinput.split(" ").length;
		System.out.println("The number of words are:"+numberofwords);
		int numofvowels= 0;
		for(int i=0;i<length;i++) {
			char temp= userinput.charAt(i);
			if (temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u') {
				numofvowels++;
			}
			
		}
		System.out.println("The number of vowels is:"+numofvowels);
		
	}

}
