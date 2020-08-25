package Feb2_2019;

public class Rodselling {

	public static void main(String[] args) {
	// QUES 3

	//a rod is there, it can be sold in different length of 
	//pieces mentioned below, tell the best combination that
	// can be sold for maximum profit
		int[] rod={0,3,5,6,15,10,25,12,24};
		int[] stg=new int[rod.length];
		
		stg[0]=0;
		stg[1]=rod[1];
		//basecase
		
		for(int i=2; i<rod.length; i++)
		{
			stg[i]=rod[i];//lumpsum
			
			
			for(int left=1, right=i-left; left<=right;
					left++,right--){
				stg[i]=Math.max(stg[left]+stg[right],stg[i]);
				}

//			for(int left=1, right=i-left; left<i; left++,right-- )
//			{
//				stg[i]=Math.max(stg[left]+rod[right], stg[i] );
//			}
//		
			}
	
		
		for( int val: rod)
		{
			System.out.print(val+" ");
		}
		
		System.out.println();
		System.out.println("MAX:"+stg[rod.length-1]);
		
	}
	}		
		
		
		
		
		
		
		
		
		
//		int[] rod={0,3,5,6,15,10,25,12,24};
//		int max=Func(rod,rod.length);  //memorisation technique
//		System.out.println(max);
//		System.out.println(num);
//		//climb up from 0 to 7
//		//FuncTabulation(7);
//	}
//
//	static int num=0;
//	public static int[] Func(int[] arr,int n)
//	{
//		
//		if(n==0){
//			num++;
//			return;
//			}
//			
//		if(n>=1){
//			Func(n-1);
//		}
//		if(n>=2){
//			Func(n-2);
//		}
//		if(n>=3){
//			Func(n-3);
//		}
//	}
//		
//	}
//
//
