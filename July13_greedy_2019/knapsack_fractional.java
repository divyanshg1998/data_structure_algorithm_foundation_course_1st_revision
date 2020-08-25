// package July13_greedy_2019;
import java.util.*;

public class knapsack_fractional {

	static class Interval implements Comparable<Interval>{
		double wt;
		double val;
		
		Interval(double wt,double val)
		{
			this.wt=wt;
			this.val=val;
		}
		
		public int compareTo(Interval other){
			double r1=1.0*this.val/this.wt;
			double r2= 1.0*other.val/other.wt;

			
			//cant return r1-r2
			//wrong bcz to return int
			
			
			//but we want in descending order 
			//
			if(r1>r2)
				return -1;//-ve
			else if(r1==r2)
				return 0;
			else
				return 1;	//-ve
		}
		
	}
	
	public static int func(int[] wts, int[] val){
		
		Interval[] intervals = new Interval[wts.length];
		
		for(int i=0; i < intervals.length; i++){
			intervals[i]= new Interval(wts[i], val[i]);
			}
	
		Arrays.sort(intervals);
		
		int vib=0;
		int  rc=50;
		
		for(int i=0; i<intervals.length; i++){
			
			if(intervals[i].wt>rc){
				
				vib+=rc*(1.0*intervals[i].val/intervals[i].wt);	
				rc=0;
				break;
			}
			
			else{
				rc-=intervals[i].wt;
				vib+=intervals[i].val;
			}
			
		}
		
		return vib;
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int[] wts={10,40,20,30};
		int[] val={60,40,100,120};

		System.out.println("Ans:"+func(wts,val));	
		
	}

}
