package Gray;

import java.util.HashMap;

public class Hashmapthings {

	public static void main(String[] args) {
		String path[][]= {{"a","b"},{"d","e"},{"e","b"},{"d","a"}};
		
		HashMap<String,String> srcToDest = new HashMap<>();
		
		for(int i=0;i<path.length;i++) {
			srcToDest.put(path[i][0],path[i][1]);
			
			
		}
		System.out.println(srcToDest);
		
		for(String str:srcToDest.keySet()) {
			if(srcToDest.containsKey(srcToDest.get(str))==false) {
				System.out.println(srcToDest.get(str));
				break;
			}
			
		}
		

	}

}
