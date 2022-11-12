package Gray;

public class pinkk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"one", "open", "door", "fish", "Lost", "Load", "Cat", "Canada", "Air"};
		for(int i=0;i<str.length;i++) {
			if(str[i].length()!=3&&str[i].charAt(0)!='C') {
				continue;
			}
			System.out.println(str[i]);
			
			
		}

	}

}
