package Feb2_2019;

public class Bitonic_inc_dec {

	public static void main(String[] args) {
		//dp start
		// ques 2
		
		// an array is given as input , find the largest 
		//subsequance of it, such that its values are first
		// increasing and then decreasing or precisely 
		// itd length

		int[] arr = { 10, 22, 9, 33, 21, 50, 41,
				60, 80, 1 };
	
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

		int[] dec = new int[arr.length];
		dec[arr.length-1] = 1;
		//START FROM END
		for (int i = arr.length-2; i >=0 ; i--) {
			//see i value
			dec[i] = 1;
			for (int j = arr.length-1; j > i; j--) {
				if (arr[i] >= arr[j]) {

					dec[i] = Math.max(dec[i], dec[j] + 1);
				}
			}

		}
		

		for (int val : strg) {
			System.out.print(val + " ");
		}

		System.out.println();
		
		for (int val : dec) {
			System.out.print(val + " ");
		}
		System.out.println();
		int max = -1;
		for (int i = 0; i < strg.length; i++) {
			max = Math.max(max, strg[i]+dec[i]-1);
			
		}
		System.out.println("max:" + max);
	}
		
	}

