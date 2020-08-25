package Jan20_2018;

public class zero_oe_two {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 2, 1, 0 };
		int a = 0, b = 0, c = 0;
		// use while loop
		for (c = 0, a = 0; c < arr.length; c++) {
			if (arr[c] == 2) {
			}
			else if (arr[c] == 1) {
				swap(arr, b, c);
				b++;
		
			} else {
				swap(arr, b, c);
				swap(arr, b, a);
				a++;
				b++;
			}
		}	
		for (int val : arr) {
				System.out.print(val + " ");
			}
		}
	
	public static void swap(int[] arr, int a, int c) {
		int temp = arr[a];
		arr[a] = arr[c];
		arr[c] = temp;
	}
}
