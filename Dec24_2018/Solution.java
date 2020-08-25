package Dec24_2018;

import java.util.*;

import com.sun.xml.internal.ws.api.ComponentFeature.Target;

public class Solution {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
//		int a= scn.nextInt();
//		int arr=new int[a];
//		for(int i=0; i< a; i++) {
//			arr[i]=scn.nextInt();
//		}
//		int sum=scn.nextInt();
		
		int[] arr = {1, 3, 5, 7, 0};
		int sum=6;
		int i= TargetSum1(arr, 0, sum);
		System.out.println(i);
		ArrayList<String> a=TargetSum2(arr, 0, sum);
		System.out.println(a);
	}

	public static int ctr = 0;

	// we have got a target of 70 to achieve
	public static int TargetSum1(int[] arr, int idx, int tar) {

		if(idx==arr.length || tar<0)
		{
					
			return 0;
		}
		
		if (tar == 0) {
				ctr++;
		
				int c = TargetSum1(arr, idx+1, tar);
				
				return c+1;
				
			}
	
		int sum=0;
		int a=0;
		int b=0;
	
		 a=	TargetSum1(arr, idx + 1, tar - arr[idx]);
		  b=	TargetSum1(arr, idx + 1, tar);
		
		sum=a+b;
		return sum;
	}

	
	public static ArrayList<String> TargetSum2(int[] arr, int indx, int tar) {
		if(indx==arr.length || tar<0)
		{
			ArrayList<String> a=new ArrayList<>();

			a.add("");
			
			return a;
		}
				
		if(tar==0) {
			ArrayList<String> a=TargetSum2(arr, indx+1, tar);

		return a;
				
		}
		
		
		
		ArrayList<String> c=new ArrayList<>();
		
		if(tar-arr[indx]>=0) {
		ArrayList<String> a=TargetSum2(arr, indx+1, tar-arr[indx]);

		for(int i=0; i< a.size(); i++) {
			c.add(arr[i]+a.get(i));			
		}
		}
		
		if(tar-arr[indx]>=0) {
		ArrayList<String> b=TargetSum2(arr, indx+1, tar);		
		for(int i=0; i< b.size(); i++) {
			c.add(b.get(i));			
		}
		}
		
		return c;
	
}
	}