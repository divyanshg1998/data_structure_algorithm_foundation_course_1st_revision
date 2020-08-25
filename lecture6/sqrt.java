
package lecture6;
import java.util.*;

public class sqrt {
	
		static int [] oa;
		static int [] sa;
		static int nob;
		static int sob;
				
		public static void build(int[] arr) {
			
			oa=arr;
			
			sob=(int)Math.sqrt(arr.length);
			
			nob=(int)Math.sqrt(arr.length);
			
			for ( int i=0; i<arr.length ; i++) {
				
				int place=i/sob;
				sa[place]+=oa[i];				
			}	
			
		}
		
		public static void update( int key, int index) {
			
			int bi=index/sob;
			sa[bi]=sa[bi]+(key-oa[index]);
			oa[index]=key;
		}
		
		public static void query(int l, int r) {
			
			int lbi=l/sob;
			int rbi=r/sob;
			
//			if
			
			int sum=0;
			
			for(int i=l; i/sob==lbi; i++) {
				
				sum+=oa[i];
			}
			
			
			for (int bi=lbi+1 ; bi<=rbi-1; bi++) {
				
				sum+=sa[bi];				
			}
			
			
			for(int j=rbi; r/sob==rbi; j++) {
				sum+=oa[j];
			}
			
			
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr=new int [53];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
		}
		
		
		build(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
