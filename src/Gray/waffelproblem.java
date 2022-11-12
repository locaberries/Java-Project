package Gray;

public class waffelproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x= "aba#";

		for(int i=0;i<x.length();i++) {

			int waffelz = x.indexOf('#');
			if(waffelz==-1) {
			break;
			}
			x=x.replaceFirst("#", "");
			substring()
			//char name= x.charAt(waffelz-1);
			
			//x=x.replaceFirst(name+"","");

			System.out.println(x);

		}
	}

}
