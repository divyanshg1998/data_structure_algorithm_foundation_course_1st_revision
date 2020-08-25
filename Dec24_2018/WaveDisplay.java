package Dec24_2018;

import java.util.Scanner;

public class WaveDisplay {

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
			for(int i=0; i<mat.length; i++)
			{
				for(int j=0; j<mat[0].length; j++)
				{
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
				}
			
				
	for(int i=0,j=0; i<mat.length; i++)
		{
			if(i%2==0)
				for(j=0;j<mat[0].length;j++)
				{
					System.out.print(mat[i][j]+" ");
				}
			else
				for(j=mat[0].length-1;j>=0;j--)
				{
					System.out.print(mat[i][j]+ " ");
				}
				}
		System.out.println();
		
		for(int i=0,j=0; i<mat[0].length; i++)
		{
			if(i%2==0)
				for(j=0;j<mat.length;j++)
				{
					System.out.print(mat[j][i]+" ");
				}
			else
				for(j=mat.length-1;j>=0;j--)
				{
					System.out.print(mat[j][i]+ " ");
				}
				}				
	}
}
