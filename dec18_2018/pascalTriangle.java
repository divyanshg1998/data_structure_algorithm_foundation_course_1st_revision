package dec18_2018;

import java.util.Scanner;

public class pascalTriangle {

	public static void main(String[] args) {
		
		int i;
		int j;
		Scanner scn = new Scanner(System.in);
		// int num = scn.nextInt();
	
		int num=5;
		for (i = 0; i < num; i++) {
				int val = 1;
		
				for (j = 0; j <= i; j++) {
				System.out.print(val+" ");
				val = (val * (i - j)) / (j + 1);
			}

			/*
			 * logic
			 * 0c1 1c0 1c1 2c0 2c1 2c2 3c0 3c1 3c2 3c3
			 * relation ncr+1 = ncr
			 * two formulas there
			 * ncr+1 = ncr * (n-r+1) /r 
			 * or ncr = ncr-1 * (n-r)/r+1
			 */

			System.out.println();
		}
	}

}
