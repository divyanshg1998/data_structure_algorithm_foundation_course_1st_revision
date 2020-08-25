package Dec30_2018;

public class SubString_Forward {

	public static void main(String[] args) {
		printss("abc","");
	}
	
	static public void printss(String ques, String ans){
		
		if(ques.equals("")){
			System.out.println(ans);
			return;
		}
		
		char ch=ques.charAt(0);
		String ros= ques.substring(1);
		
		printss(ros , ch+ans);
		printss(ros , ans);
	}
}
	
