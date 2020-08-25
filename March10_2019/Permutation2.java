package March10_2019;

public class Permutation2 {

	public static void main(String[] args) {
		//pemrutation by ans approach
		//euler
		String str="abc";
		perm(str,"");	
			}
	
	public static void perm(String ques, String ans) {
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<ans.length()+1 ; i++)
		{									//till +1 bcz to 
											//insert at end too
			String left=ans.substring(0,i);
			String right=ans.substring(i);
			perm(ques.substring(1) ,left + ques.charAt(0) + right);
			}		
	}
}
