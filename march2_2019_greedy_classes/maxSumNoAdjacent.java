package march2_2019_greedy_classes;

public class maxSumNoAdjacent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] arr={5,6,10,100,10,5};
		int[] stg=new int[arr.length];
		// find the max sum such that no adjacent element used //O(n)
		int include=arr[0],exclude=0;
		int nexclude=0;
		int ninclude=0;
		for(int i=1; i<arr.length; i++)
		{
			nexclude=Math.max(include,exclude);
			ninclude=exclude+arr[i];
		
			include=ninclude;
			exclude=nexclude;
		}
		//here the logic is either a no. is coming or not coming in
		//sum,  but by euler, and, we reject the case when only a 
		//single element is coming, we include it with previous (not adjacent)
		//elements
	
		System.out.println(Math.max(ninclude,nexclude));
		//can make a euler of an element coming or not,
		//then try this, dont forget to reject cases
		System.out.println();
}
}
		

