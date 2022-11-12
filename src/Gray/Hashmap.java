package Gray;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		int nums[]= {6,7,8,10,7,15};
	
		HashMap<Integer,Boolean> map= new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				System.out.println(nums[i]);
				break;
			}
			else {
				map.put(nums[i],true);
			}
			
		}
	}

}
