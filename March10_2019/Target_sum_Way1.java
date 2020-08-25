package March10_2019;

public class Target_sum_Way1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		TargetSum1(arr, 0, 70);
		System.out.println(ctr);
	}

	public static int ctr = 0;

	// we have got a target of 70 to achieve
	public static void TargetSum1(int[] arr, int idx, int tar) {
		
		if (tar == 0) {
				ctr++;
				return;
			}
		
		if(idx==arr.length)
			return;
		
		if(tar<0)
			return;
		
			TargetSum1(arr, idx + 1, tar - arr[idx]);
			TargetSum1(arr, idx + 1, tar);

	}

}
