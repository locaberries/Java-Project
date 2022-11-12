package Gray;

public class hwpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {12,34,56,78,90,100,101};
		int target= 58;
		
		for(int i=0;i<numbers.length;i++) {
			if(target==numbers[i]) {
				System.out.println(i);
				break;
			}
			if(target<numbers[i]) {
				System.out.println(i);
				break;
			}
		}
	}

}
