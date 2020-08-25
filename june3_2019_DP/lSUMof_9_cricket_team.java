package june3_2019_DP;

public class lSUMof_9_cricket_team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//is target sum 9 possible here
		//true or false
		//cricket match
		
		int[] arr={2,5,3,1,6};
		int sum=9;
				
		fillit(arr,sum);
	}
	
	
	public static void fillit(int[] arr, int sum)
	{
		boolean[][] strg= new boolean[arr.length+1][sum+1];
		
		//if(i==0 && j==0){
	
			strg[0][0]=true;
		
		
		for(int j=0; j<strg.length; j++){
			
			strg[j][0]=true;
		}
		
		for(int j=1; j<strg[0].length; j++){
			strg[0][j]=false;			
		}
		
		for(int i=1; i<strg.length; i++){
			for (int j=1; j<strg[0].length ; j++){
				
				if(strg[i-1][j]==true){
					strg[i][j]=true;
				}
				
			else if(j-arr[i-1]>=0 && strg[i-1][j-arr[i-1]] == true )
				//first condition needed everywhere in 2d
			//or index out of bound	
			{
					//i-1 bcz not alligned with the list
					strg[i][j]=true;	
				}							
			}			
		}

		for(int i=0; i<strg.length; i++){
			for (int j=0; j<strg[0].length ; j++){
			System.out.print(strg[i][j]+" ");
			}
			System.out.println();
}
		printAllPath(strg,arr,strg.length-1,strg[0].length-1,"");
	
	}
	
	
	public static void printAllPath(boolean[][] strg , int[] arr,
			int i, int j , String str){
	
		if(j==0)	
	{
		System.out.println(str);
	}
		
	if(strg[i][j]==true){	
		if(i-1>0){
	printAllPath(strg, arr, i-1, j, str);
		}
		if(j-1>=0 && j-arr[j-1]>0)
		{
			//out of box exception
			// whenever we write an element of array
	printAllPath(strg, arr, i-1, j-arr[j-1], str+arr[i-1]);
	}
		}
	
	}
	
}