package Jan12_2019;

public class Soduku_2_repeat {

	public static void main(String[] args) {

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
		//
		// for(int boxno=0;boxno<81;boxno++)
		// {
		//
		// int rowno=boxno/arr.length;
		// int colno=boxno%arr[0].length;
		//
		//
		// if(rowno==2 || colno==2)
		// System.out.print(" ");
		// if(rowno==5 ||)
		// System.out.print(" ");
		// if(rowno==8)
		// System.out.println();
		// System.out.print(arr[rowno][colno]);
		// }
	}

	public static void Fillit(int[][] arr, int boxno) {
		if (boxno == 81) {
			printSoduku(arr);
			return;
		}
		int rowno = boxno / arr.length;
		int colno = boxno % arr[0].length;

		if (arr[rowno][colno] == 0) {
			for (int opt = 1; opt < 10; opt++) {
				if (checkToPutIf(arr, rowno, colno, opt)) {
					arr[rowno][colno] = opt;
					Fillit(arr, boxno + 1);
					arr[rowno][colno] = 0;
				}
			}
		} else {
			Fillit(arr, boxno + 1);
		}

	}

	public static boolean checkToPutIf(int[][] arr, int rowno, int colno, int opt) {

		for (int i = rowno / 3 * 3; i < rowno / 3 * 3 + 3; i++) {
			for (int j = colno / 3 * 3; j < colno / 3 * 3 + 3; j++) {
				if (arr[i][j] == opt)
					return false;
			}
		}

		for (int i = 0, j = colno; i < arr.length; i++) {
			if (arr[i][j] == opt)
				return false;
		}

		for (int i = rowno, j = 0; j < arr[0].length; j++) {
			if (arr[i][j] == opt)
				return false;
		}

		return true;
	}

}