package dec19_2018;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] arr={10,20,30};
		Func(arr,arr.length-1,"");
	}
	public static void Func(int[] arr,int vidx, String set)
	{
		if(-1==vidx)
		{
			System.out.println(set);
			return;
		}

	
		
		Func(arr,vidx-1,set);
	
		Func(arr,vidx-1,set+arr[vidx]);
	}

}