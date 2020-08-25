package Dec28_2018;

import java.util.Scanner;

public class arrPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 3, 3, 10, 4, 8, 7, };
		// Func(0,arr);
		System.out.println();
		int max = Fmax(arr.length - 1, arr);
		System.out.println("Max:" + max);

		Scanner scn = new Scanner(System.in);
		int size1 = scn.nextInt();
		int index = LinearSearchLastIndex
				(arr.length - 1, arr, size1);
		System.out.println("Lastindex:" + index);
		//int index2 = LinearSearchFirstIndex(0, arr, size1);
		//System.out.println("Firstindex:" + index2);
		/*
		int ctr=0;
		int index3[] = AllIndex(0, arr, size1, ctr);
		System.out.println("all index:");
		for(int i=0;i<index3.length;i++)
			System.out.println(index3[i]);
*/
	}

	/*
	 * public static void Func(int n, int[] arr) { 
	 * if(n==0) 
	 * return;
	 * 
	 * System.out.print(arr[n]+" "); 
	 * Func(n+1,arr);
	 * 
	 * 
	 * }
	 */

	public static int Fmax(int n, int[] arr) {
		if (n == 0) {
			int max = arr[0];
			return max;
		}

		int max = Fmax(n - 1, arr);
		if (arr[n] > max) {
			max = arr[n];
		}
		return max;

	}

	public static int LinearSearchLastIndex(int n,
			int[] arr, int num) {
		if (n == 0)
			if (arr[0] != num)
				return (-1);

		if (arr[n] == num)
			return n;
		else {
			int num2 = LinearSearchLastIndex(n - 1, arr, num);
			return num2;	
			}
		}
	

	/*public static int LinearSeachFirstIndex(int n, int[] arr, int num) {

		if (n == arr.length-1)
			if (arr[arr.length-1] != num)
				return (-1);

		if (arr[n] == num)
			return n;
		else {
			int num2 = LinearSearchFirstIndex(n + 1, arr, num);
			return num2;

		}

	}}*/
	
	public static int[] AllIndex(int vidx, int[] ar, int data, int cnt)
	{
		
		if(vidx==ar.length){
			int[] res=new int[cnt];
			return res;
		}
		
		if(ar[vidx]==data){
			cnt++;
	}
		int[] rres=AllIndex(vidx+1, ar, data, cnt);
				if(ar[vidx]==data){
					rres[cnt-1]=vidx;
				}
		
}	
	}
	
