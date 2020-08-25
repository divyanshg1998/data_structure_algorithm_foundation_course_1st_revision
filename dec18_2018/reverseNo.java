package dec18_2018;

import java.util.Scanner;

public class reverseNo {

	public static void main(String[] args) {
		

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		while(num!=0)
		{
			System.out.print(num%10);
			num=num/10;
			
		}

	}

}
