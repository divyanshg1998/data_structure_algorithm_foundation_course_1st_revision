package june3_2019_DP;

public class combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//coins
		//we have infinite no. of coins of 2,3,5,6
		//find all the possible combinations and permutations 
		//to get the sum as 7 using the given arr
		
		int[] arr={2,3,5,6};
		
		countCombinationForSum7(arr);

		System.out.println("<=================>");
		countPermutationForSum7(arr);
		
		//Q2: find the path of combination and permutation		
	}
	
	public static void countCombinationForSum7(int[] arr){
		int[] count = new int[7+1];

		count[0]=1;
		
			
			for(int j=0; j<arr.length; j++){
				for(int i=1; i<count.length; i++){
		
//				if(i-arr[j]<0)
//					break;
				
				if( i-arr[j]>=0 && count[i-arr[j]]!=0)
					count[i]=count[i]+count[i-arr[j]];
				}
				
		}
			
		System.out.println("COMBINATION FOR EACH SUM:");
		
		int ctr=0;
		for(int val:count){
			System.out.println(ctr+": "+val);
			ctr++;
		}

		System.out.println("Total comb by which sum is 7 are:"+count[count.length-1]);
		
		System.out.println("paths by combination:");
		pathByComination(7,count,arr,"",0);	
		
	}
	
	public static void pathByComination(int sum,int[] count,
			int[] arr,String str,int numForComb){
		
		if(sum==0){
			System.out.println(str);
			return;
		}
		
		for(int i=numForComb; i<arr.length; i++){
			
			if(sum-arr[i]>=0){
				pathByComination(sum-arr[i], count, arr, str+arr[i],i);
					}			
		}
		
	}
	
	public static void countPermutationForSum7(int[] arr){
		
		int[] count = new int[7+1];

		count[0]=1;
		
		for(int i=1; i<count.length; i++){
			
			for(int j=0; j<arr.length; j++){
		
				if(i-arr[j]<0)
					break;
				else if( count[i-arr[j]]!=0)
					count[i]=count[i]+count[i-arr[j]];
				}
				
		}
		System.out.println("PERMUTATION FOR EACH SUM:");
		
		int ctr=0;
		for(int val:count){
			System.out.println(ctr+": "+val);
			ctr++;
		}
		
		System.out.println("Total perm by which sum is 7 are:"+count[count.length-1]);
		System.out.println("paths by permutaation:");
		pathByPermutation(7, count, arr, "");
	}
		
	public static void pathByPermutation(int sum,int[] count,
			int[] arr,String str){
			
			//only difference between path by permution and combination is of order
			//i.e there is no numForComb
			//hence no order
		if(sum==0){
			System.out.println(str);
			return;
		}
		
		for(int i=0; i<arr.length; i++){
			
			if(sum-arr[i]>=0){
				pathByPermutation(sum-arr[i], count, arr, str+arr[i]);
					}			
		}
	}
		
	
}
