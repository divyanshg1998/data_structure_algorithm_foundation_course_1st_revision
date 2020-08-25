package Dec24_2018;

import java.util.Scanner;

public class MatMultiply {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int size1 = scn.nextInt();
		int size2 = scn.nextInt();
		int[][] mat= new int[size1][size2];
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
			{
				mat[i][j]=scn.nextInt();
			}
		}
		int[][] mat2= new int[size1][size2];
		for(int i=0; i<mat2.length; i++)
		{
			for(int j=0; j<mat2[0].length; j++)
			{
				mat2[i][j]=scn.nextInt();
			}
		}
		
		MatMultiply(mat, mat2);

	}

	public static void MatDisplay(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void MatMultiply(int[][] mat1, int[][] mat2) {

		int row1 = mat1.length;
		int row2 = mat2.length;
		int col1 = mat1[0].length;
		int col2 = mat2[0].length;
		if (col1 != row2) {
			System.out.println("cant");
			return;
		}

		int[][] prod = new int[row1][col2];

		for (int r = 0; r < prod.length; r++)
			for (int c = 0; c < prod[0].length; c++) {
				for (int k = 0; k < col1; k++)
					prod[r][c] += mat1[r][k] * mat2[k][c];
			}

		MatDisplay(prod);
	}

}
