package Jan12_2019;

public class Soduku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		PrintMatrix(mat);

		System.out.println();
		System.out.println();

		FillIt(mat, 0);
	}

	public static void PrintMatrix(int[][] mat) {
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[0].length; c++) {
				if (mat[r][c] > 0)
					System.out.print(mat[r][c]+" ");
				else
					System.out.print("_ ");
				if (c == 2 || c == 5)
					System.out.print(" | ");
			}

			System.out.println();
			if (r == 2 || r == 5)
				System.out.println("----------------");

		}
		System.out.print("----------------");

	}

	public static void FillIt(int[][] mat, int lastBox) {
		if (lastBox == 81) {
			PrintMatrix(mat);
			return;
		}
		
		int rno = lastBox / 9;
		int cno = lastBox % 9;

		if (mat[rno][cno] == 0) {
			for (int i = 1; i <= 9; i++) {
				boolean var = CanFill(mat, lastBox, i);
				if (var == true) {
					mat[rno][cno] = i;
					FillIt(mat, lastBox + 1);
					mat[rno][cno] = 0;
				}
			}

		} else {
			FillIt(mat, lastBox + 1);
		}
	}

	public static boolean CanFill(int[][] mat, int lastBox, int num) {
		int rno = lastBox / 9;
		int cno = lastBox % 9;
		// row wise check
		for (int i = 0; i < mat.length; i++) {
			if (mat[rno][i] == num)
				return false;
		}
		// col wise check
		for (int i = 0; i < mat.length; i++) {
			if (mat[i][cno] == num)
				return false;
		}
		// submatrix check
		for (int i = (rno / 3) * 3; i < ((rno / 3) * 3) + 3; i++)
			for (int j = (cno / 3) * 3; j < ((cno / 3) * 3) + 3; j++) {
				if (mat[i][j] == num)
					return false;
			}
		return true;
	}

}