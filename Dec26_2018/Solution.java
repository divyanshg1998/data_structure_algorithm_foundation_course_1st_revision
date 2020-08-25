package Dec26_2018;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//
//		Scanner scn = new Scanner(System.in);
//		int size1 = scn.nextInt();
//		int size2 = scn.nextInt();
//		int[][] arr= new int[size1][size2];
//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j=0; j<arr[0].length; j++)
//			{
//				arr[i][j]=scn.nextInt();
//			}
//		}
//		
//		
//		int i,j;
//		int[] arr2=new int[arr.length];
//		int min,max;
//		for(i=0;i<arr.length;i++)
//		{
//			min=arr[i][0];
//			for(j=0;j<arr[0].length;j++)
//			{
//				if(arr[i][j]<min)
//					min=arr[i][j];
//			}
//			arr2[i]=min;
//			System.out.println(min);
//		}
//		System.out.println();
//		int[] arr3=new int[arr[0].length];
//		
//		for(j=0; j<arr[0].length;j++)
//		{
//			max=arr[0][j];
//			for(i=0;i<arr.length;i++)
//			{
//				if(arr[i][j]>max)
//				{
//					max=arr[i][j];
//				}
//				
//			}
//			arr3[j]=max;
//			System.out.println(max);
//		}
//		
//		System.out.println();
//		int flag=0;
//		for(i=0;i<arr2.length;i++)
//		{
//			for(j=0;j<arr3.length;j++)
//		{	if(arr2[i]==arr3[j])
//			{
//			System.out.println(arr2[i]);
//			flag=1;}
//		}}
//		if(flag==0)
//			System.out.println("No Such Point Exist");
//		
//	}
//	
//
//}
		
		Scanner scn = new Scanner(System.in);
		String str2 = scn.next();
		Func(str2);
		}
	
	public static int Func(String str)
	{
		for(int i = 0 ; i < str.length() ; i++)
		{
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	public static boolean Palindrome(String str)
		{
			boolean flag=true;
			for(int i=0,j=str.length()-1; i<str.length()/2;i++,j--)
				{
				if(Character.toUpperCase(str.charAt(i))!=
						Character.toUpperCase(str.charAt(j)))
					{flag=false;break;}
				}
			
			return flag;
		
		}
	}