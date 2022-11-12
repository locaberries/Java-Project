package Gray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flowerhomework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userinput= reader.readLine();
		String userinputz[]= userinput.split(" ");
	   // char firstletter= userinput.charAt(0);
		char firstletter= userinputz[0].charAt(0);
		boolean loop= false;
	
		
		for(int i=1;i<userinputz.length;i++) {
			if(userinputz[i].charAt(0)!=firstletter) {
			System.out.println("NO!!!!");
			loop=true;
			break;
			}
			
		}if(loop==false) {
			System.out.println("YES!");
		}
		
	}

}
