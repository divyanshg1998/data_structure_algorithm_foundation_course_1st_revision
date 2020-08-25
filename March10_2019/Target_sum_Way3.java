package March10_2019;

import java.util.ArrayList;

public class Target_sum_Way3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//by using arraylist
		//it is extremely imp that you make the euler of this 
		// by arr={10,20,30} and target=30;
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		ArrayList<Integer> asf = new ArrayList<>();
		TargetSum3(arr, 0, 70, asf); // answersoFAR
	}

	public static void TargetSum3(int[] arr, int idx, int tar, 
			ArrayList<Integer> asf) {
		if (idx == arr.length-1 ) {
			
			if( tar == 0){
			System.out.println(asf);
			}
			
			return;
		}
		
		if (tar < 0) {
			return;
		}
		
    		asf.add(arr[idx]);
			TargetSum3(arr, idx + 1, tar - arr[idx], asf);
			asf.remove(asf.size()-1);
			TargetSum3(arr, idx + 1, tar, asf);

	}
}
