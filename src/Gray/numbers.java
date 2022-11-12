package Gray;

public class numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		
		
		for(int i=0;i<=23;i++) {
		System.out.println(first+second);
		int temp= first+second;
		
		first=second;
		second=temp;
		}

	}

}
