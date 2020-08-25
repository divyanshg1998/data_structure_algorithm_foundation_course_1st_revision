package Dec26_2018;

import java.util.Scanner;

public class String_output {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str2 = scn.next();
		//System.out.println(printOdd(str2));
		//string to array
		//char[] arr= str2.toCharArray();
		//SubStringDisp(str2);
		//Palindrome(str2);
		 PrintPalSubstring(str2);
	}
		
	public static String printOdd(String str){
		String result="";
				for(int i=1;i<str.length();i+=2)
				{
					result+=str.charAt(i);
					}
				return result;
	}
	
	public static String SubStringDisp(String str){
		
		for(int i=0;i<str.length();i++)
		{
			for (int j=i; j<str.length();j++)
				PrintPalSubstring(str.substring(i,j+1));
			}
	}
	
	public static boolean Palindrome(String str)
	{
		boolean flag=true;
		for(int i=0,j=str.length()-1; i<str.length()/2;i++,j--)
			{
			if(str.charAt(i)!=str.charAt(j))
				{flag=false;break;}
			}
		return flag;
	}
	
	public static void PrintPalSubstring(String str){

		for(int i=0;i<str.length();i++)
		{
			for (int j=i; j<str.length();j++)
				{
				String str2=(str.substring(i,j+1));
				boolean var=Palindrome(str2);
						if(var)
							System.out.println(str2);
					}
	}
	}
	
	
}