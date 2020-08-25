package Dec30_2018;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		int[] arr2=Rec(arr,0);
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		}
	
	public static int[] Rec(int arr[], int n)
	{
		if(n==arr.length-1)
		{
			return arr;
		}
		
		int arr2[]=Rec(arr,n+1);
		
		for(int i=n+1;i<arr2.length-1;i++)
		{
			if(arr2[n]>=arr2[i] && arr2[n]<=arr2[i+1])
			{
				int temp=arr2[n];
				int j;
				for( j=n;j<i;j++)
				{
					arr2[j]=arr2[j+1];
				}
				arr2[j]=temp;
				break;
			}}
		
		 if(arr2[n]>=arr2[arr2.length-1])
		{	
			int temp=arr2[n];
			int j;
			for(j=n;j<arr2.length-1;j++)
		{
			arr2[j]=arr2[j+1];
		}
		arr2[j]=temp;
		
		}
		return arr2;
	}
		
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		int size2 = scn.nextInt();
	int[] arr2=Func((arr.length/2-1),arr);
	for(int i=0;i<arr2.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.print(arr[size2]);
	
	}
	
	public static int[] Func(int n, int[] arr)
	{
		int temp=arr[n];
		arr[n]=arr[arr.length-1-n];
		arr[arr.length-1-n]=temp;
		if(n == 0)
			return arr;
		
		int[] arr2=Func(n-1,arr); 
		return arr2;
	}
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		int size2 = scn.nextInt();
		
		int[] arr2=Func(arr,0);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println(arr2[size2]);
	}
	
	public static int[] Func(int[] arr, int n)
	{
	if(n==arr.length-1)
	{
		int m=arr.length;
		int[] arr2= new int[m];
		arr2[arr[n]]=n;
		return arr2;
	}
	
	int[] arr2=Func(arr,n+1);
	arr2[arr[n]]=n;
		return arr2;
	}
}
//----------------------------------------------------
//-----------------------------------------------------.

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
*/
		Scanner scn = new Scanner(System.in);
int size = scn.nextInt();
int[] arr=new int[size];
for(int i=0;i<size;i++)
{
	arr[i]=scn.nextInt();
}
	int[] arr2=Func(arr,0);
	
	for(int i=0;i<arr2.length;i++)
	{
		System.out.print(arr2[i]+" ");
	}
	System.out.println();
	}
	
	
	public static int[] Func(int arr[], int n)
	{
		if(n==arr.length-1)
			{
			return arr;
			}
		
		int[] arr2=Func(arr,n+1);	
		for(int i=n;i<((arr2.length)-1);i++)
	{
			if (arr2[i + 1] < arr2[i]) {
				int temp = arr2[i];
				arr2[i] = arr2[i + 1];
				arr2[i + 1] = temp;
		}
		}
		return arr2;
		
	}
}


