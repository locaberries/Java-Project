package Gray;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startingindex = 0;
		String weekdays[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String userchoice= "Tuesday";
		int elements[]= new int[35];
		for(int i=0;i<weekdays.length;i++) {
			if(weekdays[i].compareTo(userchoice)==0) {
				startingindex=i;
				break;
			}
		}
		for(int i=startingindex,j=1;i<elements.length;i++,j++) {
			elements[i]= j;
			if(j==31) {
				break;
			}
		}
		for(int j=0;j<weekdays.length;j++) {
			System.out.print(weekdays[j].substring(0,1)+"\t");
			for(int i=j;i<elements.length;i=i+7) {
				if(elements[i]==0) {
				System.out.print("\t");
				
				}
				else {
					System.out.print(elements[i]+"\t");
				}
					
				
			}
			System.out.println();
			
		}
	

	}

}
