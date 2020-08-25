package dec19_2018;

import java.util.Scanner;

public class BaseChange {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
//		int sn = scn.nextInt();
//		int sb = scn.nextInt();
//		int db = scn.nextInt();
		
	int sn=16, sb=8 , db= 2;
		int num2 = Func(sb, sn, db);		
		System.out.println(num2);
		
		
		/*System.out.println(num);
		//binary to octal special
		
		int num2= Func(10, num, 8);  
		System.out.println(num2);*/
	}



public static int Func(int sb, int sn, int db )
{
	int  sum=0;
	
	for(int i=0, rem, pow=1; sn!=0; i++)
	{
		rem=sn%db;
		sum= sum + rem*pow;
		pow=pow*10;
		sn/=db;
	}
return sum;

}
}