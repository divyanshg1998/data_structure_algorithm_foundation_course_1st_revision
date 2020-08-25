package Jan12_2019;

public class crossword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr=
			{
		   {'+','-','+','+','+','+','+','+','+','+'},
		   {'+','-','+','+','+','+','+','+','+','+'},
 		   {'+','-','+','+','+','+','+','+','+','+'},
 		   {'+','-','-','-','-','-','+','+','+','+'},
 		   {'+','-','+','+','+','-','+','+','+','+'},
 		   {'+','-','+','+','+','-','+','+','+','+'},
 		   {'+','+','+','+','+','-','+','+','+','+'},
 		   {'+','+','-','-','-','-','-','-','+','+'},
 		   {'+','+','+','+','+','-','+','+','+','+'},
 		   {'+','+','+','+','+','-','+','+','+','+'},
			};
		
  	   String[] str={"LONDON","DELHI","ICELAND","ANKARA"};
 		Func(arr,str,0);
		}
	
	public static void Func(char[][] arr, String[] str, int wpsf){
		//words present so far
		if(wpsf==str.length)//we have inserted all the strings at there positions
		{
			for(int i=0; i<arr.length; i++)
			{
				for(int j=0; j<arr.length; j++)
				{
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}		
		
		for(int i=0; i<arr.length; i++)
			for(int j=0; j<arr.length; j++)
			{
				
				if(arr[i][j]=='-' || arr[i][j]==str[wpsf].charAt(0)){
					if(checkHor(arr, i , j , str[wpsf]))
					{
						boolean[] overlap=new boolean[str[i].length];
						placeWordH(arr, i , j ,string, wpsf, overlap);
						unplaceWordH(arr, i, j, string, wpsf, overlap);
						}
					
					if(checkVer(arr, i , j , str[wpsf]))
					{
						boolean[] overlap=new boolean[str[i].length];
						placeWordV(arr, i , j ,string, wpsf, overlap);
						unplaceWordV(arr, i, j, string, wpsf, overlap);
						}
				}}
		
	//	else if()
	}
	
	public static void checkHor(int[] arr, int r, int c, 
			String str)
	{
		//all are false statements
		if(r>0 && r-str,length>0)
		{
			
		}
		
		else if(c+str.length-1>arr.length-1)
		{
			return false;
		}
		
		else if(arr[r][c+str.length-1]=='+')
			return false;
					

		else if(arr[r][c-1]=='+')
			return false;
		
		else
		{
			
		}
			
	}
	

	for(int j=0; j<str[wpsf].length; j++)
	{
		if(arr[r+j]='-' || arr[r+j]==str[wpsf].charAt(j))
			
	}

}

//magnet puzzle bonus question