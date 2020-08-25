package Dec30_2018;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	String str = scn.next();
	int num=Func(str,0);
	System.out.println(num);
	}
	
	public static int Func( String str, int n)
	{
		
		if(n==str.length()-1)
		{
			int num = str.length()-1;
			char ch=str.charAt(num);
			int num2=(int)ch-48;
			return num2;
		}
			
			int sum=Func(str, n+1);
		int ch=str.charAt(n)-48;
		sum+=ch;
		return sum;
		}
	}