package Gray;

public class Calculatordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c= new Calculator (20,10);
		System.out.println(c.x);
		int count=0;
		int g,h;
		for(;;) {
			g=c.x;
			h=c.y;
			c.decrementByTwo();
			if(g!=c.x&&h!=c.y) 
				count++;
			else
				break;
			
		}
		System.out.println(count);
	}
	
}
