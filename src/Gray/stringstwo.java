package Gray;

public class stringstwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x= "fbsJfbaJkbdjbdhsbdhabdjbdjbdbdbdj";
		
		
		System.out.println( countletters(x,'d'));
		
	
		 System.out.println(countletters(x,'k'));
			
		

	}
public static int countletters (String x, char letter) {
	
	int sizeofstring= x.length();
	int counter= 0;
	for(int i = 0;i<sizeofstring;i++) {
		if(x.charAt(i)==letter) {
			
		
			counter++;
			
		}
		
	}
	return counter;
	
}
}
