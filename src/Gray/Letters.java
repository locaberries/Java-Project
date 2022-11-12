package Gray;

public class Letters {

	public static void main(String[] args) {

		String x= "neveroddoreven";
        boolean sflag= true;
		int lastindex = x.length();
		--lastindex;
		for(int startingindex= 0 ;startingindex<lastindex;startingindex++,lastindex--) {
			if(x.charAt(startingindex)!=x.charAt(lastindex)) {
				System.out.println("Not a pal");
				sflag= false;
				break;
			}else{
				
				
			}

		}
		
		if(sflag== true) {
			System.out.println("Matching");
			
		} System.out.println(3>4);
	}
}