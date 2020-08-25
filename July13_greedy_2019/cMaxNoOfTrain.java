package July13_greedy_2019;

import java.util.Arrays;

public class cMaxNoOfTrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={900,940,950,1100,1500,1800};
		int[] b={910,1200,1120,1130,1900,2000};
		//if a and b are not sorted
		System.out.println("ans:"+func(a,b));
	}

	public static int func(int[] a, int[] b){
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i=0,j=0,count=0,max=0;
		
		while( i<a.length && j<b.length ){
			
			if(a[i] <= b[j]){
				count++ ;
				i++;
			}
			
			max=Math.max(max, count);
			
			 if(a[i] >= b[i]) {
				count--;
				j++;
			}			
		}
		
		return max;
		
		
		
	}
	
}
