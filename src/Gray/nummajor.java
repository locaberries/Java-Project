package Gray;

import java.util.HashMap;

public class nummajor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]={5,0,5,5,5,6,6};
		
		HashMap<Integer,Integer> map= new HashMap<>();
		
		for(int i=0;i<numbers.length;i++) {
			if(map.containsKey(numbers[i])==false) {
				map.put(numbers[i], 1);
			
				
				
			}else {
				map.put(numbers[i],map.get(numbers[i])+1);
			}
			
		}
		for(int x: map.keySet()) {
			if(map.get(x) >= (numbers.length+1)/2) {
				System.out.println("YES " + x);
				return;
			}
		}
		System.out.println("NO");
	
		
		
	
		
	
	}

}
