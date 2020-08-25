// package dec17_2018;

import java.util.Scanner;

public class primeNo{

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		/*int ctr = 2;
		while (ctr =< num/2) {
			if (num % ctr == 0) {
				System.out.println("this is not prime no.");
				return;
			}
			ctr++;/;
		}
		System.out.println("this is prime no.");
		*/

	int ctr = 2;
		while (ctr*ctr <= num) {
			if (num % ctr == 0) {
				System.out.println("this is not prime no.");
				return;
			}
			ctr++;
		}

		System.out.println(" this is prime no.");
	}

}
