package june3_2019_DP;

public class climbstairs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//can take 1,2,3 steps
		//to go from 7 to 0
		//find no. of possible paths
		int[] arr=new int[8];
		
		arr[0]=1;

		pathsToClimbDownFrom7To0(1, arr);
	}

	public static void pathsToClimbDownFrom7To0(int n, int[] arr){
				
		for(int i=n; i<arr.length; i++){
				
		if(i-1>=0){
		arr[i]+=arr[i-1];
		}
	
		if(i-2>=0){
			arr[i]+=arr[i-2];
			}
	
		if(i-3>=0){
			arr[i]+=arr[i-3];
			}
				
		}
		
		System.out.println("pathsToClimbDownFrom7To0:");
		System.out.println(arr[arr.length-1]);
		
		int ctr=0;
		for(int val:arr){
			System.out.println(ctr+": "+val);
			ctr++;
		}

		printPath(arr,0,"");
	}
	
	public static void printPath(int arr[], int ctr,String str){
		
		if(ctr==4){
			System.out.println(str);
		}
		for(int i=1; i<=arr[ctr]; i++){
			if(ctr+i-1>=0)
			 printPath(arr, ctr+i, str+ctr);
			
			
		}
	}
}
