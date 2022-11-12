package Gray;

public class Calculator {
	int x;
	int y;
	public int add() {
		return x+y;
	}
	public int subtract() {
		return x-y;
		
	}
	public Calculator(int x, int y) {
		this.x=x;
		this.y=y;
	}
	private int multiply() {
		return x*y;
	}
	public int multiply1() {
		return multiply();}
	public void decrementByTwo() {
		if(x - 2 > 0&&y - 2 > 0) {
			x= x-2;
			y= y-2;
			
		}
	}
}
	