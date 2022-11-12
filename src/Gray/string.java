package Gray;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x= "fbsJfbaJkbdjbdhsbdhabdjbdjbdbdbdj";
		
		int sizeofstring= x.length();
		int counter= 0;
		int countertwo= 0;
		for(int i = 0;i<sizeofstring;i++) {
			if(x.charAt(i)=='j') {
				
			
				counter++;
				
			}
			if(x.charAt(i)=='k') {
				
				countertwo++;
			}
		}
		System.out.println("j occurs " + counter+ " k occurs " + countertwo);

	}

}
