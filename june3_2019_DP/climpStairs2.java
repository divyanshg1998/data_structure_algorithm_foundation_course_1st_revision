package june3_2019_DP;

public class climpStairs2 {

	public static void main(String[] args) {
	
		//we store here
		int var=7;
		int[] qb= new int[8];
	
		System.out.println(stair(var,qb));;
			
	}
	
	public static int stair (int n,int[] qb){
		
		if(n==0){
			return 1;
		}
				
		if(qb[n]!=0){
			return qb[n];
		}
		
		int ways1=0;
		int ways2=0;
		int ways3=0;
		
		if(n-1>=0){
			ways1=stair(n-1,qb);
		}
		
		if(n-2>=0){
			ways2=stair(n-2,qb);
		}
		
		if(n-3>=0){
			 ways3=stair(n-3,qb);
		}
		
		int ways=ways1+ways2+ways3;
		
		return ways;		
		
	}
	
	

}
