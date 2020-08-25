package dec21_2018;

import java.util.Scanner;

public class InverseArray {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int[] arr2=new int[size];
		for(int i=0; i<size; i++)
		{
			arr2[arr[i]]=i;
		}
		
		int a=0;
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			if(arr[i]!=arr2[i])
				{
				a=1;}
		}
		if(a==0)
		System.out.println("true");
		else
			System.out.println("false");
	}
}
