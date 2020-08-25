package Dec24_2018;

public class Mat {

	public static void main(String[] args) {
		
//		int[][] mat= new int[2][2];
//		//Scanner scn= new Scanner(System.in);
//		int val=1;				
//		int [][] mat1={{1,2,3},{4,5,6}};
//		MatDisplay(mat1);
//	}
//	
//		public static void MatDisplay(int[][] mat) {
//			for(int i=0; i<mat.length; i++)
//			{
//				for(int j=0; j<mat[0].length; j++)
//				{
//					System.out.print(mat[i][j]+" ");
//	}System.out.println();}

		
		int[] arr = {1, 3, 5, 5, 5, 5 ,7, 7,7,123,123,123 ,125,
				125 } ;
		int ctr=5;
		int start=0;
		int end=arr.length-1;
		int indx=-1;
		
		while(start<=end){
			int mid=(start+end)/2;
			
			if(arr[mid]==ctr)
				{
				while(arr[mid+1] == ctr)
				{
					mid++;
				}
				indx=mid;
				}
			
			else if(arr[mid]<ctr)
				start=mid;
			
			else if (arr[mid]>ctr)
				end=mid;
		}	
			System.out.println(indx);

		}
}