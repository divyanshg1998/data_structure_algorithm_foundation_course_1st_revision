package dec17_2018;

import java.util.Scanner;

public class PrintTillN {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num2 = scn.nextInt();
		
		System.out.print("2 ");
		boolean var= true;
		
				for(int ctr= 3; ctr<=num2; ctr++)
				{
					for(int i=2; i*i<=ctr; i++)
					{
						if(ctr%i==0)
							{var=false;
							break;}
					}
						
				
				if(var==true)
					System.out.print(ctr+ " ");
				var= true;
					}
				}
					}

	

