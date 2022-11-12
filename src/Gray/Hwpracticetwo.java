package Gray;

public class Hwpracticetwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1,2,14,0,0,67,0,89,0,6,4,};//{1,2,14,67,89,6,4,0,0,0,0}
		int zero;
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]==0) {
					for(int j=i+1;j<numbers.length;j++) {
						if(numbers[j]!=0) {
							numbers[i]= numbers[j];
							numbers[j]=0;
							break;
							
						}
							
					}
				
			}
			
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
