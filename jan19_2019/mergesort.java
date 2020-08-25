package jan19_2019;

public class mergesort {

	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 3, 4, 2, 6 };
		arr1 = mergeSort(arr1, 0, arr1.length-1);

		for (int val : arr1) {
			System.out.println(val);
		}

	}

	public static int[] mergeSort(int[] arr1, int low,
			int high) {

		if(low==high)
		{
			int[] arr4=new int[1];
			arr4[0]=arr1[low];
			return arr4;
		}
		// base case at end
		int[] ARR1 = mergeSort(arr1, low, (low + high) / 2);// high aleways
		// like this to get mid,,binary search
		int[] ARR2 = mergeSort(arr1, (low + high) / 2 + 1, high);// high aleways
		//sorted array is returned
		int[] res =  mergeSortFuncSUBSET(ARR1, ARR2);
		return res;
		}
	
	public static int[] mergeSortFuncSUBSET(int[]
			arr1, int[] arr2) {

		int[] res=new int[arr1.length + arr2.length];
		int one = 0, two = 0, three = 0;
		for (; one < arr1.length && two < arr2.length;
				three++) {
		if (arr1[one] <= arr2[two]) {
			res[three] = arr1[one];
			one++;
		} else {
			res[three] = arr2[two];
			two++;
		}
	}

	for (; one < arr1.length; one++) {
		res[three] = arr1[one];
	}
 
	for (; two < arr2.length; two++) {
		res[three] = arr2[two];
	}
	return res;
	// no need of if (one<arr1.length)

}
}
