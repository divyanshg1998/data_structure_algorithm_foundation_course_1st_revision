package dec18_2018;

import java.util.Scanner;

public class pattern_pyramid {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		//  int num = scn.nextInt();
		int num=5;
		int i = 1; 
		int ctr=1;
		while (i <= num) {
			int j = 1;
			while (j <= i) {
				System.out.print(ctr+ " ");
				j++;
				ctr++;
			}
			i++;
			System.out.println();
		}

	}
}