package dec18_2018;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
//		int num = scn.nextInt();
		int num=5;
		int space = num/2, star = 1,val=1;
		for (int i = 1; i <= num; i++) {

			for (int k = 1; k <= space; k++) {
				System.out.print(" ");
			}
			int myval = val;
			for (int l = 1; l <= star; l++) {
				System.out.print(myval);
				if (l <= star / 2)
					myval++;
				else
					myval--;
			}

			if (i <= num / 2) {
				space--;
				star += 2;
				val++;
			} else {
				space++;
				star -= 2;
				val--;
			}
			System.out.println();
		}
	}

}
