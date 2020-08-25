package Dec24_2018;

import java.util.Scanner;

public class BUbbleSort2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		for( int j=0; j<arr.length-1; j++)
		{
			for(int k=j+1; k<arr.length-j; k++)
			{
				if(arr[k-1]>arr[k])
				{
					int temp;
					temp=arr[k];
					arr[k]=arr[k-1];
					arr[k-1]=temp;
				}
			}
			
		}		
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
