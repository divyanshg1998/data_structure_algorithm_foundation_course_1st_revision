package Dec20_2018;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		char ch= str.charAt(0);
		
		String val = "12345";
		int val1 = Integer.parseInt(val);
		 
		if(ch>='a' && ch<='z'){
			System.out.println("Lower Case");
			System.out.println( ch - 'a' + 'A');
		}
		else 
			{
			System.out.println("Upper Case");			
			System.out.println( ch + 'A' - 'a');
			}
		System.out.println(val1);
		
	}

}
