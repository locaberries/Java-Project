package Gray;

public class Loopspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4978-3002,odd,reverse,skip multi of five

		for(int i=4978;i>3002;i--) {
		
			if(i%3==0) {
				continue;

			}
			if(i%2==1) {//if 2 % gives you 1 you will get an odd number, 0 is an even number
				continue;
			}
			System.out.println(i);
		}
	}

}
