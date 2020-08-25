package dec18_2018;

import java.util.Scanner;

public class Solution {
	

	public static void main(String[] args) {
		/*
		Scanner scn = new Scanner(System.in);
		int num2 = scn.nextInt();
		
		for(int i=1; i<=num2; i++)
		{
			for(int j=1; i>=j; j++ )
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

	int space = num-1, star = 1;
	for (int i = 1; i <= num; i++) {
		
		for (int k = 1; k <= space; k++) {
			System.out.print(" ");
		}
			int value=i;
		for (int l = 1; l <= star; l++) {
			System.out.print(value);
			if(l<=star/2)
				value++;
			else
				value--;
		}

			space--;
			star += 2;
	 System.out.println();
		}
		
	}
	}


	Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		for(int i=0; i<num; i++)
		{
			for(int j=0;j<num;j++)
			{
			if(i==j || i+j==num-1) 
			{
				System.out.print("*");
				
			}
			else
				System.out.print(" ");
				
		}
			System.out.println();
			}

	}}
		
	
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();int
		space = num+1, star =1;
		for (int i = 1; i <= num; i++) {

			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			
			for (int l = 1; l <= space; l++) {
				System.out.print("@");
				
			}
			for (int k = 1; k <= star; k++) {
				if(i!=num && k!=star )
						System.out.print("*");
			}
			
			
				star++;
				space -=2;
				
			
			System.out.println();
		}

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		for(int i=1; i<=num; i++)
			{
			int val=1;
			for(int j=1; j<=((2*num)-1); j++)
		
			{
				if(i>=j || i+j>=(num*2))
					System.out.print(val+ " ");
				else
					System.out.print("  ");	
			if(i>j)
				val++;
			else if(i+j>=num*2)
			{
				val--;
			}
			}
			
				System.out.println();
	}
		
		Scanner scn = new Scanner(System.in);
		int size= scn.nextInt();
		int[] arr= new int[size];
		for( int j=0; j<arr.length; j++)
		{
			arr[j] = scn.nextInt();
				
		}
		int max=arr[0];
		for(int j=1; j<arr.length; j++)
		{
			if(arr[j]>max)
				max=arr[j];
		}
		System.out.println(max);
		
		Scanner scn = new Scanner(System.in);
		int size= scn.nextInt();
		int size2;
		size2=sqrt(size);
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int num= scn.nextInt();
		int i, ctr=0;
		for( i=0; i<arr.length; i++)
		{
			if(arr[i]==num){
				System.out.println(i);
				ctr=1;
				break;
		}	
		
	}if(ctr==0)
		System.out.println("-1");
	*/
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr=new int[size];
	
	for(int i=0;i<size;i++)
	{
		arr[i]=scn.nextInt();
		
	}
	int lo=0, hi= arr.length-1;
	while (lo < hi) {
		int temp = arr[lo];
		arr[lo] = arr[hi];
		arr[hi] = temp;
		lo++;
		hi--;
	}

	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+ " ");
	}
	
}}
