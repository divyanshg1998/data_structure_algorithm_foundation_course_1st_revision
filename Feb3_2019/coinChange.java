package Feb3_2019;

public class coinChange {

	public static void main(String[] args) {
		//ques -2
		// for a particular set of array ,we have coins currency as 
		//mentioned, now find all such combination as well as 
		//permutations to get sum as 7 ,such that you have infinite 
		// no. of each currency
		int[] arr={2,3,5};
		int sum=7;
		combForInfinite(arr,sum);		
		permForInfinite(arr,sum);
	}

	public static void combForInfinite(int[] arr, int amount)
	{
		int[] arr1= new int[amount + 1];
		arr1[0]=1;
		
		for(int j=0; j<arr.length;j++){
			
			for(int i=1; i< arr1.length;i++ )
			{
				if(i-arr[j]>=0 && arr1[i-arr[j]]>0)
				arr1[i]+=arr1[i-arr[j]];
				
			}
			
		}
		
		for(int val:arr1)
			System.out.print(val+" ");
		
		System.out.println();
		System.out.println("ans"+ arr1[arr1.length-1]);
			
	}
	
	public static void permForInfinite(int[] arr, int amount)
	{
	
		
	}
	
	// why last ques was 2 d but this ques is 1d,
	//bcz there is no repetition of elements in last ques  
}
