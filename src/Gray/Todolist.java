package Gray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Todolist {

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
				int userdelete= Integer.parseInt(reader.readLine());
				for (int i=userdelete-1;x[i+1]!=null;i++) {
					x[i]= x[i+1];
				}
				currentindex--;

			}
			if(useroption==3) {
				for(int i=0;i<currentindex;i++){
					System.out.println((i+1)+")"+x[i]);
				}
			}
			if(useroption==4) {
				 x= new String[max];
				 currentindex= 0;
			}
	} while(useroption!=5);
		}

}
