package Gray;

public class Stringbuilderstuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userinput= "24";
		String userinput2= "5";
		StringBuilder str= new StringBuilder(userinput);
		str.reverse();
		userinput= str.toString();
		str= new StringBuilder(userinput2);
		str.reverse();
		userinput2= str.toString();
		int int1 = Integer.parseInt(userinput);
		int int2 = Integer.parseInt(userinput2);
		str= new StringBuilder(""+(int1+int2));
		System.out.println(str.reverse());
	}
	







}
