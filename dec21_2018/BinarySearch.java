package dec21_2018;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int num=Func(arr);
	System.out.println(num);
	}

public static int Func(int arr[]){
int start=0, end=arr.length-1,mid

Scanner scn = new Scanner(System.in);
int num= scn.nextInt();

while(start<=end)
{
	mid=(start+end)/2;
	if(arr[mid]==num)
		return mid;
	
	else if(arr[mid]>num)
		end=mid;
	
	else if(arr[mid]<num)
		start=mid;
}
return -1;

}

}
