package Jan20_2018;

public class zero_one {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 1, 0, 1 };

		int a = 0, b = 0;

		for (b = 0, a = 0; b < arr.length; b++) {
			if (arr[b] == 0) {
				}

			else {
				int temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				a++;
				}
		}
		for (int val : arr) {
			System.out.println(val);
		}

	}
}
