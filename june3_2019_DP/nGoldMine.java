package june3_2019_DP;

public class nGoldMine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we can dig from j=0 in horizontal, above and downwards
		//]
		
 int mat[][] = {{10, 33, 13, 15},
                {22, 21, 04, 1},
                {5, 0, 2, 3},
                {0, 6, 14, 2}}
 ;
 goldmine(mat);
 System.out.println("ANS:83");
 
 
	}

	public static void goldmine(int[][] arr){
		
		int[][] strg=new int[arr.length][arr[0].length];
		
		for(int i=0; i<arr.length; i++){
			strg[i][arr[0].length-1]=arr[i][arr.length-1];
		}
		
		for(int j=arr[0].length-2; j>=0; j--){
			for(int i=0; i<arr.length; i++){
				if(i==0){
					strg[i][j]=arr[i][j]+Math.max(strg[i][j+1], strg[i+1][j+1]);
				}
				
				else if(i==arr.length-1){
					strg[i][j]=arr[i][j]+Math.max(strg[i-1][j+1], strg[i][j+1]);	
				}
				
				else{
					int max=Math.max(strg[i+1][j+1], strg[i][j+1] );
					
					strg[i][j]=arr[i][j]+Math.max(max, strg[i-1][j+1])
				;	}		
			
		}
		}
		
		for(int i=0; i<strg.length; i++){
			for(int j=0; j<strg[0].length; j++)
			{
				System.out.print(strg[i][j]+ " ");
							}
		System.out.println();
		}
		//to print path
//printpath(strg,1,0,"");	
		
	}
//	public static void printpath(int[][] strg,int i, int j ,String str){
//		
//		
//	}
	
}
