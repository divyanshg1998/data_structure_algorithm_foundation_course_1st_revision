package July13_greedy_2019;
import java.util.*;

public class ActivitySelection {

	static class Interval implements Comparable<Interval>
	{
		int start;
		int end;
		
		Interval(int start, int end){
			this.start=start;
			this.end= end;
		}

	public int compareTo(Interval other){
		return this.end-other.end;	
	}		
	
	}

	public static int func(int[] starts, int[] ends){
		
	Interval[] intervals= new Interval[starts.length];
	
	//CONSTRUCTOR CALLED
	for(int i=0; i<starts.length ;i++){
		intervals[i]=new Interval(starts[i],ends[i]);	
	}
	
	Arrays.sort(intervals);
	
	int prevElement=0;
	int count=1;
	
	for(int i=1; i< intervals.length; i++){
		
		if(intervals[i].start >= intervals[prevElement].end){
			
			count++;
			prevElement=i;
		}		
	}
	return count;
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] starts={3,0,1,8,5,5};
		int[] ends=  {4,6,2,9,9,7};
		System.out.println(func(starts, ends));
}
}
