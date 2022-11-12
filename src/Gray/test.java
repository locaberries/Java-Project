package Gray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Type out");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String userinput;
		for(;;) {
			
			userinput=reader.readLine();
			if(userinput.compareTo("Done")==0)
				break;
			System.out.println(userinput.length());
			
		}

	}

}
