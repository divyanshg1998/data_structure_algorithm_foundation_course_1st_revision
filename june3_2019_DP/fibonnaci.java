package june3_2019_DP;

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var=7;
		
		System.out.println(fib(var));

		int[] qb= new int[7+1];
		
		qb[0]=0;
		qb[1]=1;
		System.out.println(fibWithDp(var,qb));
			
	}
	
	public static int fib (int n){
		if(n==0 || n==1){
			return n;
		}
		
		int fn1=fib(n-1);
		int fn2=fib(n-2);
		
		int fn=fn1+fn2;
		
		return fn;		
		
	}
	
	public static int fibWithDp( int n , int[] qb){
				
		if(n==0 || n==1){
			return n;
		}
		
		if(qb[n]!=0)
			return qb[n];
		
		int fn1=fibWithDp(n-1, qb);
		int fn2=fibWithDp(n-2, qb);
		
		int fn=fn1+fn2;
		qb[n]=fn;
		
		return fn;
		
	}

}
