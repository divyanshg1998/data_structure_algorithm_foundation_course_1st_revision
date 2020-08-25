package Dec24_2018;

public class SpiralDisplay {

	public static void main(String[] args) {

	int[][] mat={{11,12,13,14,15},{21, 22, 23, 24,25},{31,32,33,34,35},
			{41,42,43,44,45},{51,52,53,54,55}};
	int tot=mat.length*mat[0].length;
	int cnt=1;
	int rmax=mat.length-1;
	int rmin=0, cmin=0, cmax=mat[0].length-1;
	
	while(cnt<=tot){
		
		//left
		for(int r=rmin; r<=rmax; r++)
		{
			System.out.print(mat[r][cmin]+" ");
			cnt++;
		
		}
		cmin++;
		//bottom
		for(int c=cmin; c<=cmax;c++)
		{
			System.out.print(mat[rmax][c]+" ");
		cnt++;
				}
		rmax--;
	//right
		for(int r=rmax;r>=rmin;r--)
		{
			System.out.print(mat[r][cmax]+" ");
			cnt++;
		}
		cmax--;
		//
		for(int c=cmax; c>cmin;c--)
		{
			System.out.print(mat[rmin][c]+" ");
			cnt++;
		}
		rmin++;
		
		}
	}
	
	
}


