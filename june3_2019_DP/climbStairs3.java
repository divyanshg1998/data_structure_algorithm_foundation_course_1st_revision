package june3_2019_DP;

public class climbStairs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we have to climb 
	int[] stairs={1,2,3,1,0,2,0,2,4};
	
	System.out.println("no. of possible ways to reach to 0 from 9:");
	System.out.println(func(stairs));
	minStepsCount(stairs);
	}
	
public static int func (int[] jumpsize){
		
		int[] strg= new int[jumpsize.length];
		strg[0]=1;
		
		for(int i=1; i<strg.length;i++){
			
			for(int js=1;js<=jumpsize[i];js++){
				
				int var= i-js;
				if(var>=0){	
					strg[i]=strg[i]+strg[var];
				}
				else{
					break;
				}				
			}		
		}
		return strg[strg.length-1];
	}


public static void minStepsCount(int[] jumpsize){
		
		int[] strg= new int[jumpsize.length];
		strg[0]=0;
		
		for(int i=1; i<strg.length;i++){
			
			if(jumpsize[i]==0){
				strg[i]=-1;
				continue;
			}
			//special code to handle the case when no possible min steps possible
			int myMin=Integer.MAX_VALUE;
			
			for(int js=1;js<=jumpsize[i];js++){
				
				int var= i-js;						
				if(var>=0 && strg[var]!=-1){
					myMin=Math.min(strg[var] , myMin);
				}
				
			}
			
			if(myMin != Integer.MAX_VALUE)
			{
				strg[i]=myMin+1;
			}
			
			else
				strg[i]=-1;
			}
		
		//to find the minimum path possible here

		
		System.out.println("no of (minimum steps) path possible:"+strg[strg.length-1]);

		System.out.println("ALL MINIMUM STEPS PATH POSSIBLE:");
		FindAllMinimumPaths(strg.length-1, "", strg);
		System.out.println("Note:In descending Order here because of the trev/ersal");
		
			}
	
public static void FindAllMinimumPaths(int j, String str, int[] arr){
	
	if(arr[j]==1){
		str+=j;
		str+=0;
		System.out.println(str);
		return;
		}

	for(int i=arr[j]; i>0; i--){
		
		if(arr[j-i]+1==arr[j]){
			FindAllMinimumPaths(i, str+j, arr);
			}
	}	
}
}
