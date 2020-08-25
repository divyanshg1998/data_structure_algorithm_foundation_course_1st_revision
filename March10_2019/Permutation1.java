package March10_2019;

public class Permutation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ques approach
		//all possble permutations of abc
		//perm=3 fact
		String str="abc";
		perm(str, "");
		}
	
	public static void perm(String ques, String ans) {
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<ques.length();i++)
		{
			String left=ques.substring(0,i);
			String right=ques.substring(i+1,ques.length());
			perm(left+right,ans+ques.charAt(i));		
		}
		
	}
		

}
