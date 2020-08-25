package Dec25_2018;

import java.util.Scanner;

public class SnakeCircle {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int size1 = scn.nextInt();
		int size2 = scn.nextInt();

		int[][] arr= new int[size1][size2];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j]=scn.nextInt();
			}
		}
		
		
		int dir = 0;
		int r = 0, c = 0;
		while (r < arr.length && 0 <= r && 0 <= c 
				&& c < arr[0].length)
		{
			dir = dir + arr[r][c];
			dir = dir % 4;

			if (dir == 0)
				r++;
			else if (dir == 1)
				c++;
			else if (dir == 2)
				r--;
			else if (dir == 3)
				c--;
			
		}

		if (r < 0)
			r++;
		else if (r >= arr.length)
			r--;
		else if (c < 0)
			c++;
		else if (c >= arr[0].length)
			c--;

		System.out.println(r + ", " + c);

	}
}
