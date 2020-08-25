package Feb2_2019;
public class SubArrays {

	public static void main(String[] args) {
		// DP-3
		//Ques 1 
		//to find the max length of the subsequance in  
		//increasing order of the values in the array
		//print the biggest subsequance too here
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 1 };
		
		int[] strg = new int[arr.length];
		strg[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			strg[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] >= arr[j]) {

					strg[i] = Math.max(strg[i], strg[j] + 1);
				}
			}
		}

		for (int val : strg) {
			System.out.print(val + " ");
		}
		System.out.println();
		int max = -1;
		int idx=0;
		for (int i = 0; i < strg.length; i++) {
			max = Math.max(max, strg[i]);
			idx=i;
		}
		System.out.println("max:" + max);
	}	
}
