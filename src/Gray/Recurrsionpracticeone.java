package Gray;

public class Recurrsionpracticeone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userinput= 4;
		System.out.println(getFactorialByRecursion(userinput));

	}


	public static int getFactorialByRecursion(int input) {
		if(input == 1) {
			return 1;
		}
		return input* getFactorialByRecursion(input-1); 
	}

}

