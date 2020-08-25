package March10_2019;

public class equisets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrange in 2 sets so that same sum 
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		equisets(arr, 0, "", 0, "", 0);
		System.out.println(ctr);
		//to avoid mirror images 
		System.out.println();
		equisets(arr, 1, ""+arr[0], arr[0], "", 0);
		
		
	}
	public static int ctr=0;
	public static void equisets(int[] arr, int indx, 
			String set1, int sos1, String set2, int sos2) {
		if(indx==arr.length)
		{
			if(sos1==sos2)//  or can use && set1.compareTo(set2)<=0   
						//when set1<set2 in dictionary order
			{			//to avoid mirror images
			ctr++;
			System.out.println(sos1);
			System.out.println(set1);
			System.out.println(set2);
			System.out.println("<==========>");
			}
			return;
		}
		equisets(arr, indx+1, set1+arr[indx], sos1+arr[indx], set2, sos2);
		equisets(arr, indx+1, set1, sos1, set2+arr[indx], sos2+arr[indx]);
		
	}
		

}
