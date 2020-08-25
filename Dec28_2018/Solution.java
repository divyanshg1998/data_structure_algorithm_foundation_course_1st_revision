package Dec28_2018;

import java.util.Scanner;

public class Solution {

	public static void main(String[] arrgs) {
		// TODO Auto-generated method stub
		
		/*Scanner scn = new Scanner(System.in);
		int size1 = scn.nextInt();
		int size2 = scn.nextInt();
		int[][] mat= new int[size1][size2];
		
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
			{
				mat[i][j]=scn.nextInt();
			}
		}
		
		int[][] mat2= new int[size1][size2];
		
		for(int i=0; i<mat2.length; i++)
		{
			for(int j=0; j<mat2[0].length; j++)
			{
				mat2[i][j]=scn.nextInt();
			}
		}
		
		int sum=MatMultiply(mat, mat2);
		System.out.println(sum);
}
	
	
	public static int MatMultiply(int[][] mat, int[][] mat2){
		int sum=0;
		for(int i=0 ; i<mat.length; i++)
			for(int j=0; j<mat[0].length; j++)
			{
				if(i==j)
					sum=sum+mat[i][j]+mat2[i][j];
				
			}
		return sum;
		
	}

		Scanner scn = new Scanner(System.in);
		int size1 = scn.nextInt();
		Func(size1);
		}
	
		public static void Func(int n)
		{
		if(n!=0)
		{
			for(int i=0;i<n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		Func(n-1);
		}
		
		Scanner scn = new Scanner(System.in);
		int size1 = scn.nextInt();
		Func(size1-1);
	}
		
	public static void Func(int n)
		{
			if(n==0)
				System.out.println("1");
			else{
				Func(n-1);
				
					System.out.print("1");
				for(int i=1; i<=n; i++)
			{
				int varr1=Mult(n,n-i+1);
				int varr2=Mult(i,1);
				int varr3=varr1/varr2;
				System.out.print(varr3);
			}
		System.out.println();
		}
		}
		public static int Mult(int i,int j)
		{
			int prod=1;
			if(i==0)
				i++;
			if(j==0)
				j++;
			for(;i>=j;i--)
			{
				prod*=i;
			}
			return prod;
		}

} 
		
Scanner scn = new Scanner(System.in);
int size1 = scn.nextInt();
int num=Func(size1);
System.out.println(num);
}
	public static int Func(int num)
	{
	if(num==1)
		return 1;
	return( num+ Func(num-1));
	
	}
	}
	
		
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arrr=new int[size];
		for(int i=0;i<size;i++)
		{
			arrr[i]=scn.nextInt();
		}
		int size2 = scn.nextInt();
		boolean varr=Rec(arrr, size-1 , size2);
		System.out.println(varr);
	}
	
	public static boolean Rec(int[] arrr,int n ,int digit)
	{
		if(n==0)
		{
			if(arrr[0]==digit)
				return true;
			return false;
		}
		boolean varr=Rec(arrr,n-1,digit);
		
			if(varr==true)
				return true;
		
			else if(arrr[n]==digit)
				return true;
			
			else 
				return false;
			
			}
		
	

}

	
		
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arrr=new int[size];
		for(int i=0;i<size;i++)
		{
			arrr[i]=scn.nextInt();
		}
		int size2 = scn.nextInt();
		int index2 = LinearrSearrchLastIndex(arrr.length-1, arrr, size2);
		System.out.println( index2);}
	
	public static int LinearrSearrchLastIndex(int n, int[] arrr, int num) {

		if (n == 0)
			if (arrr[0] != num)
				return (-1);

		if (arrr[n] == num)
			return n;
		else {
			int num2 = LinearrSearrchLastIndex(n - 1, arrr, num);
			return num2;

		}

	}}
		
		//---------------------------------------------------
		 * -----------------------------------------------
		 
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		boolean var=Rec(arr,0);
		System.out.println(var);
		
}	
	public static boolean Rec(int[] arr, int ctr){
		if(ctr==arr.length-1){
			if(arr[ctr]==arr[arr.length-1-ctr])
				return true;
			else 
				return false;
		}
		
			boolean var=Rec(arr,ctr+1);
			if(var==false)
				return false;
			else if(arr[ctr]==arr[arr.length-1-ctr])
				return true;
			else 
				return false;
		
	}
	
	}
	_______________--------------------------------------------------
	-------------------------
	---------------------------------------------
	*/
int[] arr = { 1, 2, 3, 3, 3, 10, 4, 8, 7, };
		int index3[] = AllIndex(0, arr, 3, ctr);
		System.out.println("all index:");
		for(int i=0;i<index3.length;i++)
			System.out.println(index3[i]);
		}

	public static int[] AllIndex(int n, int[] arr, int data, int ctr)
	{
		if(n==0)
			ctr=0;		
		if(arr[n]==data){
			ctr++;
			}

		if(n==arr.length-1){
			int[] res=new int[ctr];
			if(arr[n]==data){
				ctr++;
				res[ctr-1]=data;
				ctr--;
				AllIndex(n+1, arr,data,ctr);
				}
			return res;
	}
		
AllIndex(n+1, arr,data,ctr);

if(arr[n]==data){
	res[ctr-1]=data;
	ctr--;}

if(n==0)
	return res;
	}}
		