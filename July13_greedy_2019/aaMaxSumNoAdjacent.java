package July13_greedy_2019;
import java.util.*;

public class aaMaxSumNoAdjacent {

	public static void main(String[] args) {
	//greedy
		
	//to find all the subsets without the consecutive elements
	//of the arr
	int[] arr={5,6,10,100,10};
	System.out.println(func(arr));	
}
	
	
	public static int func(int[] arr){
		
		int inc= arr[0];
		int exc= 0;
		
		for(int i=1; i<arr.length ; i++){
			
		int newinc=	arr[i]+ exc;
		int newexc=Math.max(inc,exc);
		
		inc=newinc;
		exc=newexc;			
		}
		
		return Math.max(inc,exc);	
	}
	
}