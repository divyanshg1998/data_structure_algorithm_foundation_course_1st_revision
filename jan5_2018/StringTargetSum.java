package jan5_2018;

import java.util.ArrayList;

public class StringTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, };
		 TargetSum(arr,50,0,"");
		//TargetSubSetArrayList ( arr , 50 , 0 , new ArrayList<>() ,0);
	}

	static int count = 0;

	public static void TargetSubSetArrayList(int[] arr, int sum, int 
			vidx, ArrayList<Integer> set,int sos) {
		if (sum == sos) {
			System.out.println(++count + " " + set);
			return;
		}
		if(vidx<arr.length)
		{
			set.add(arr[vidx]);
		TargetSubSetArrayList(arr, sum, vidx+1, set,sos+arr[vidx]);
		set.remove(set.size()-1);
		TargetSubSetArrayList(arr, sum , vidx+1, set, sos);
		}
	}

	public static void TargetSum(int arr[], int sum, int vidx, String str) {

		if (sum == 0) {
			System.out.println(++count + " " + str);
			return;
		}
		else if (sum < 0)
			return;

		for (int i = vidx; i < arr.length; i++) {
				TargetSum(arr, sum - arr[i], vidx, str + arr[i] + " ");

		}

	}

	public static void TargetSum2(int arr[], int sum, int vidx, String str) {

		if (sum == 0) {
			System.out.println(++count + " " + str);
			return;
		}
		else if (sum < 0)
			return;

		for (int i = vidx; i < arr.length; i++) {
				TargetSum(arr, sum - arr[i], vidx, str + arr[i] + " ");

		}

	}

}
