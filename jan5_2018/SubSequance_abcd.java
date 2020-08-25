package jan5_2018;

public class SubSequance_abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Func("abc","");
		StringBuilder ques= new StringBuilder("abc");

		//MUST WRITE COMMENTS 
		//GIVES hints 
		//Always design euler first of the problem
		
		Funcsb(ques,new StringBuilder());
		
		//Funcsb2(ques,new StringBuilder());
	}
	
	public static void Func(String ques, String ans)
	{
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			String s1=ans+ch;
			String s2=ques.substring(0, i) + ques.substring(i+1);
			Func(s2,s1);
		}	
		}
	
//euler must
	public static void Funcsb(StringBuilder ques, StringBuilder ans)
	{
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch);
			
			Funcsb(ques,ans);
			
			ans.deleteCharAt(ans.length()-1);
			ques.insert(i,ch);
		}	
		}
	
//SEE SUBSEQUENCE PART
	//see jan 6-lecture 15 of neha singh mam for this ques and next ques
	
	
	
	
	
	
	
	
/*
	public static void Func2(String ques, String ans)
	{
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<ques.length; i++)
		{
			ch=ques.getCharAt(i);
			for(int j=0;j<=ans.length();j++)
			{
				ans=ans+
			}
			
		}
		char ch=ques.charAt(i);
		String ros=ques.substring(1);
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			left=ques.
		
		}
		}
*/
}
