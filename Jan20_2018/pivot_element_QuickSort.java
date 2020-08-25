package Jan20_2018;

public class pivot_element_QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 11, 9, 3, 8};
		System.out.println(Func(arr, 8));
		System.out.println();
		quicksort(arr,0,arr.length-1);
		for( int val: arr)
		{
			System.out.println(val);
		}
	}

	public static void quicksort(int[] arr, int lo, int hi) 
	{
		if(lo>=hi)
			return;
		
		int vidx=Func(arr,arr[hi]);
		quicksort(arr,lo,vidx-1);
		quicksort(arr,vidx+1,hi);
		
	}	
	
	public static int Func(int[] arr, int num) {

		int a = 0, b = 0;
		while (b < arr.length) {
			if (arr[b] <= num) {
				swap(arr, a, b);
				a++;
			}	
			b++;
		}
		 return (a-1);
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;		
}
	}