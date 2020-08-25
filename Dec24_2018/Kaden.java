package Dec24_2018;

import java.util.Scanner;

public class Kaden {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int size3 = scn.nextInt();
		
		int[] arr = new int[size3];
		for (int k = 0; k < size3; k++) {
	 
			 int size = scn.nextInt();

			
			for (int i = 0; i < size; i++) {
				arr[i] = scn.nextInt();
			}

			int csum = arr[0];
			int osum = arr[0];
			int cstart = 0, cend = 0, ostart = 0, oend = 0;
			for (int i = 1; i < arr.length; i++) {
				if (csum > 0) {
					csum = csum + arr[i];
					cend++;
					
				} 
				else {
					csum = arr[i];
					cstart = i;
					cend = i;

				}
				if (osum < csum) {
					osum = csum;
					ostart = cstart;
					oend = cend;
				}

			}
			System.out.println(osum);
		}
	}
}
/*
 * Scanner scn = new Scanner(System.in); int size = scn.nextInt(); int[] arr=new
 * int[size]; for(int i=0;i<size;i++) { arr[i]=scn.nextInt(); } for( int j=0;
 * j<arr.length-1; j++) { for(int k=j+1; k<arr.length-j; k++) {
 * if(arr[k-1]>arr[k]) { int temp; temp=arr[k]; arr[k]=arr[k-1]; arr[k-1]=temp;
 * } }
 * 
 * }
 * 
 * for(int i=0; i<arr.length; i++) { System.out.println(arr[i]); }
 * System.out.println("hey");
 */
