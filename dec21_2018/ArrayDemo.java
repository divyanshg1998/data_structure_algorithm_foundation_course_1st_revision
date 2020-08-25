package dec21_2018;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("syntax");
		for(int val:arr){
			System.out.println(val);
		}
	}

}
