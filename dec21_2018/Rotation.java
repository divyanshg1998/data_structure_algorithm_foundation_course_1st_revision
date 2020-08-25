package dec21_2018;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int lo = 0;
		int k = 2;
		int hi = arr.length - 1 - k;
		StrReverse(arr, 0, hi);
		StrReverse(arr, hi + 1, arr.length-1);
		StrReverse(arr, 0, arr.length - 1);

		for (int val : arr)
			System.out.println(val);
	}

	public static void StrReverse(int[] arr, int lo, int hi) {
		while (lo < hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}
}
