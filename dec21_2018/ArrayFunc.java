package dec21_2018;

import java.util.Scanner;

public class ArrayFunc {

	public static void main(String[] args) {

		int[] arr= new int[3];
		Scanner scn = new Scanner(System.in);
		System.out.print("enter size:");
		int size= scn.nextInt();
		for( int j=0; j<arr.length; j++)
		{
			arr[j] = scn.nextInt();
				
		}
		
		for(int i=arr.length-1; i>-1; i--)
		{
			System.out.println(arr[i]);
		}
		
		int max=arr[0];
		for(int j=1; j<arr.length; j++)
		{
			if(arr[j]>max)
				max=arr[j];
		}
		System.out.println("MAX "+max);

		int num= scn.nextInt();
		int i;
		for( i=0; i<arr.length; i++)
		{
			if(arr[i]==num){
				System.out.println("index:"+(i+1));
				break;
		}				
			if(i<)
		for(int k=0; k<arr.length; k++)
		{
			if(k!=i)
				
		}
		
		
	}

}
