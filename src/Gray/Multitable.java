package Gray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multitable {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Type numbers");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int userinput;		
		for(;;) {
			
			userinput=Integer.parseInt(reader.readLine());

			if(userinput==0)
				break;
			for(int i=1;i<=10;i++) {
				System.out.println(userinput+" x "+i+" = "+(userinput*i ));
				//System.out.println(userinput*i);
			}
					}
	

	}

}
