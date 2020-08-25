package Jan12_2019;

public class Soduku_advanced_bitmasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		printSoduku(arr);
		System.out.println();
		Fillit(arr, 0);
	}

	public static void printSoduku(int[][] arr) {

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
				if (j == 8)
					System.out.println();
			}
}
	
	
