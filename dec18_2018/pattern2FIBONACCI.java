package dec18_2018;

import java.util.Scanner;

public class pattern2FIBONACCI {

	public static void main(String[] args) {
		
		
//FIBBONACI
		 int a=0;
		int b=1;
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i ; j++)
			{
				System.out.print(a+ " ");
				int c=a+b;
				a=b;
				b=c;
				
			}
			System.out.println();
		}

		
		/*int num=3;
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i+2 ; j++)
			{
				System.out.print("*");
				}
			5
			System.out.println();
		}*/
}

}
