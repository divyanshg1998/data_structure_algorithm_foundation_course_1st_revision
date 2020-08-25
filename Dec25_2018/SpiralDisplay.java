package Dec25_2018;

import java.util.Scanner;

public class SpiralDisplay {
	public static void main(String[] args) {
		
		
//		Scanner scn = new Scanner(System.in);
//		int size1 = scn.nextInt();
//		int size2 = scn.nextInt();
//		
//		int[][] mat= new int[size1][size2];
//		
//		for(int i=0; i<mat.length; i++)
//		{
//			for(int j=0; j<mat[0].length; j++)
//			{
//				mat[i][j]=scn.nextInt();
//			}
//		}
		
 int[][] mat2= {{1   , 2,   3,   4},
		        {5,    6   ,7   ,8},
		        {9 ,  10  ,11  ,12},
		        {13 , 14 , 15  ,16}}
		;
		
		
		int tot=mat2.length*mat2[1].length;
		int cnt=1;
		int rmax=mat2.length-1;
		int rmin=0, cmin=0, cmax=mat2[0].length-1;
		int num=0;
		
		while(cnt<=tot)
		{
			for(int c=cmin; c<=cmax; c++)
			{
				System.out.print(mat2[rmin][c]+" ");
				cnt++;
				
			}
			if(cnt>tot)
				break;
			rmin++;
			//bottom
			for(int r=rmin; r<=rmax;r++)
			{
				System.out.print(mat2[r][cmax]+" ");
				cnt++;
					}

			if(cnt>tot)
				break;
			cmax--;
		    //right
			for(int c=cmax;c>=cmin;c--)
			{
				System.out.print(mat2[rmax][c]+" ");
				cnt++;
			}
			if(cnt>tot)
				break;
			rmax--;
			//
			for(int r=rmax; r>=rmin;r--)
			{
				System.out.print(mat2[r][cmin]+" ");
				cnt++;
				}

			if(cnt>tot)
				break;
			cmin++;
			
			}

		System.out.println();	

		cnt=1;
		rmax=mat2.length-1;
		rmin=0; cmin=0; cmax=mat2[0].length-1;
		
		while(cnt<=tot){
			
			//left
			for(int r=rmin; r<=rmax; r++)
			{
				System.out.print(mat2[r][cmin]+" ");
				cnt++;
				num=1;
			}
			if(cnt>tot)
				break;
			cmin++;
			//bottom
			for(int c=cmin; c<=cmax;c++)
			{
				System.out.print(mat2[rmax][c]+" ");
			cnt++;num=2;
					}

			if(cnt>tot)
				break;
			rmax--;
		    //right
			for(int r=rmax;r>=rmin;r--)
			{
				System.out.print(mat2[r][cmax]+" ");
				cnt++;num=3;
			}
			if(cnt>tot)
				break;
			cmax--;
			//
			for(int c=cmax; c>=cmin;c--)
			{
				System.out.print(mat2[rmin][c]+" ");
				cnt++;num=4;}

			if(cnt>tot)
				break;
			rmin++;			
			}		
	}

}
