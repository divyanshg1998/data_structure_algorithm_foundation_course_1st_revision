package Dec25_2018;

public class Rotate90 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// transpose
		int temp;
		for (int r = 0; r <= 2; r++) {
			for (int c = 0; c <= 2; c++) {
				if (r > c) {
					temp = arr[r][c];
					arr[r][c] = arr[c][r];
					arr[c][r] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// reverse

		for (int r = 0; r < arr.length/2; r++) {
			for (int c = 0; c < (arr[0].length); c++) {
				temp = arr[r][c];
				arr[r][c] = arr[arr.length - 1 - r][c];
				arr[arr.length - 1 - r][c] = temp;
			}
		}

		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}