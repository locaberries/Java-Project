package Gray;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Learningfiles {

	public static void main(String[] args) throws Exception
	{
		// pass the path to the file as a parameter
		File file = new File("C:\\Users\\locol\\eclipse-workspace\\Mint\\shoppinglist.txt");
		Scanner sc = new Scanner(file);
		HashMap<String,Integer> map= new HashMap<>();                                                                                                                    
		while (sc.hasNextLine()) {
			String temp=sc.nextLine();
			map.put(temp.split(":")[0],Integer.parseInt(temp.split(":")[1]) );

		}
		System.out.println(map);
	}
}