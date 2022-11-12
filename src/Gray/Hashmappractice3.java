package Gray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Hashmappractice3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map1= new HashMap<>();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How many items do you want to add");

		int userinput= Integer.parseInt(reader.readLine());
		String userkeyz;

		for(int i=1;i<=userinput;i++) {
			System.out.println("Enter item "+i+":");
			userkeyz= reader.readLine();
			System.out.println("Enter quantity:");
			int quantity= Integer.parseInt(reader.readLine());
			map1.put(userkeyz,quantity);
			
		}
		for(;;) {
			System.out.println("Look up item name:");
			userkeyz= reader.readLine();
			
			
			if(map1.containsKey(userkeyz)) {
				System.out.println("You have "+map1.get(userkeyz)+" "+userkeyz);
			}
			else {
				System.out.println("NO such item");
				System.out.println("Do you wish to add the item(Yes/No)?");
	             String useroption=			reader.readLine();
	             if(useroption.compareTo("Yes")==0) {
	            	 System.out.println("Enter quantitity:");
	            	int quantity = Integer.parseInt(reader.readLine());
	            	map1.put(userkeyz,quantity);
	             }
				
			}
		}
	}

}
