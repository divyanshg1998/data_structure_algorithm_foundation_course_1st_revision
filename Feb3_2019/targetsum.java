package Feb3_2019;

public class targetsum {

	public static void main(String[] args) {
		// TODO Auto-generat0ed method stub
		//ques 1
		//to find all the possible combinations that will fetch
		//sum 7 from the given arr
		int[] arr={2,3,5,0,6,1};
		//add 0 in the input and result with and without 0
		int sum=7;
		
		Func(arr,sum);
		
	}
	
	public static void Func(int[] arr, int sum)
	{
		boolean[][] bolarr= new boolean[arr.length+1][sum+1];
		bolarr[0][0]=true;
		
		for(int i=1; i<=arr.length;i++)
		{
			for(int j=0; j<=sum ;j++)
			{
				
				if(bolarr[i-1][j]==true)
					bolarr[i][j]=true;
				
				else if(arr[i-1]==j)
					bolarr[i][j]=true;
				
				else if(j>=arr[i-1] && 
					bolarr[i-1][j-arr[i-1]]==true)
					{
					bolarr[i][j]=true;
					}
				}

			}
		
		for(int i=0; i<=arr.length;i++)
		{
			for(int j=0; j<=sum ;j++)
				System.out.print(bolarr[i][j]+" ");
				System.out.println();
		}
		
		printsum(bolarr,arr,arr.length,sum,"");
		
}

	public static void printsum(boolean[][] strg, int[] 
			arr, int i, int j, String psf) {
		// we break in 4 areas
		if (i == 0 ) {
			System.out.println(psf);
			return;}
		
		if (i == 0)
			return;
		if (strg[i - 1][j] == true) {
			printsum(strg, arr, i - 1, j, psf + "");
		}
		if (j - arr[i - 1] >= 0 && strg[i - 1][j - arr[i - 1]]==
				true) {
			printsum(strg, arr, i - 1, j - arr[i-1], 
					psf + " " + arr[i - 1]);
		}Delhi@1998
		//&& strg[i - 1][j - arr[i - 1]]
}
}
