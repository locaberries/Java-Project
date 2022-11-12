package Gray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Todolisttwo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int useroption;
		int max= 5;
		int currentindex = 0;
		String x[]= new String[max];
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do  { 
			System.out.println("Pick a choice from below:\n1) Add new to-do task\n2) Delete task\n3) Print current task\n4) Clear all task\n5) Exit program");
			useroption= Integer.parseInt(reader.readLine());
			if(useroption==1) {
				System.out.println("Enter Task");
				x[currentindex]= reader.readLine();
				currentindex++;
			}
			if(useroption==2) {
				
			}
			if(useroption==3) {
				for(int i=0;i<currentindex;i++){
					System.out.println(x[i]);
				}
			}
			if(useroption==4) {
				
			}
	} while(useroption!=5);
		}

}
