package Dec24_2018;

public class test {
	public static void main(String[] args) {
	
	int[][] mat= new int[2][2];
	//Scanner scn= new Scanner(System.in);
	int val=1;				
	int [][] mat1={{1,2,3},
					{4,5,6}};
	MatDisplay(mat1);
}

	public static void MatDisplay(int[][] mat) {
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
			{
				System.out.print(mat[i][j]+" ");
}System.out.println();}
	
	}
}