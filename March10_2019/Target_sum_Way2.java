package March10_2019;

public class Target_sum_Way2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//make euler , total pow(2,n) strings are made, for each call 
		//it is made and destroyed when we leave a func.
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		TargetSum2(arr, 0, 70,"");
	}

	public static void TargetSum2(int[] arr, int idx, int tar, 
			String str) {
	if(tar==0)
	{
		System.out.println(str);
		return;
	}
	
	if(tar<0){
		return;
	}
	
	if(idx==arr.length){
	return;
	}
	TargetSum2(arr,idx+1,tar-arr[idx], 
			str+arr[idx]);
	TargetSum2(arr,idx+1,tar,str);
	
	
	}
	}		
