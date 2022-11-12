package Gray;

public class Recurssionpraticetwo {
	

	public static void main (String args[]) {
		int userinput= 5;
		printNumbers(userinput);
	}
	public static void printNumbers (int input) {
		if(input == 10) {
			System.out.println(10);
			return;
		}
		System.out.println(input);
		printNumbers(input+1);
	}
}
