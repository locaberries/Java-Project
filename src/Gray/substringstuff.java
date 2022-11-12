package Gray;

public class substringstuff {

	public static void main(String[] args) {
		
		String x= "ldldfsafkj%dfdfdfdf%dfdfdfdfd";
		
		
		x = x.substring(x.indexOf('%')+1) + x.substring(0, x.indexOf('%',int ));
		
		System.out.println(x);
		
		

	}

}
