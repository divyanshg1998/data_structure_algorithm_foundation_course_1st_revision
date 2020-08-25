package Dec25_2018;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		

		/*Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r= scn.nextInt();
		int var=Func(n,1);
		System.out.println(var);
		var=Func(n,n-r+1);
		System.out.println(var);
		int var2=Func(r,1);
		System.out.println(var/var2);
	
	}

	public static int Func(int start, int end)
	{
		int prod=1;
		for(int i=start; i>=end; i--)
		{
		prod=prod*i;	
				}
		return prod;
	}
		
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		boolean var = true;
		int num3, num4;
		if (num2 % num1 == 0){
			System.out.print(num1+" ");
			System.out.println(num2);}
		else if (num1 % num2 == 0)
			{System.out.print(num2+" ");
			System.out.println(num1);}
		else if (num2 <= num1) {
				num3 = num2;
				num4 = num1;
				Func(num3,num4);
			} 
		else {
				num3 = num1;
				num4 = num2;
				Func(num3,num4);
				}		
	}

public static void Func(int num3,int num4) 
{
	int num = -1;

for (int i = 1; i <= num3 / 2; i++) {
	if (num3 % i == 0)
		if (num4 % i == 0)
			num = i;
}
System.out.print(num+" ");


for(int i=1;i<num4;i++){
	if((num3*i)%num4==0)
		System.out.println(num3*i);break;
		
}
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
	            
	               if(size<=1 || arr[i]<0){
	                	ctr=2;
	                  	break;}
	          
	               else if(arr[i]==num){
	    	                System.out.println(i);
	    	                ctr=1;
	    	                break;}
	    	                	
	                }
	        
	        
	    if(ctr==0)
	        System.out.println("-1");
	    if(ctr==2)
	    	System.out.println("Invalid Input");
	    }	
}	
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		//second array
		int[] arr3=new int[size];
		for(int i=0;i<size;i++)
		{
			arr3[i]=scn.nextInt();
		}
		
		
		
		int[] arr2=new int[size];
		for(int i=0; i<size; i++)
		{
			arr2[arr[i]]=i;
		}
		int a=0;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr3[i]);
			if(arr3[i]!=arr2[i])
				{
				a=1;break;}
		}
		
		if(a==1)
		System.out.println("false");
		else
			System.out.println("true");
	}
}
		Scanner scn = new Scanner(System.in);
		float a = scn.nextInt();
		float c=(float)((5.0/9)*(a-32));
		System.out.println(c);	
		*/
		
		
		
		
		/*int[] arr= {76,1,5,3,6,9,7,89};
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
			System.out.println(arr[i]) ;
		}
	}

}*/
	


	


/*
51 3 2 2 2 4 0
4
2
2
2
3
0
4
-1 and 6
2 and 3

	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=scn.nextInt();
	}
	int ip = scn.nextInt();
	for( int j=0; j<arr.length-1; j++)
	{
		for(int k=1; k<arr.length-j; k++)
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
		for(int j=i+1; j<arr.length;j++)
		{
			for(int k=j+1;k<arr.length;k++)
				{if(ip==(arr[i]+arr[j]+arr[k]))
				System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
						
		}
			
	}
	}}}
	
	/*
//	int[] arr={0,1,2,3,4,5};
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
System.out.println("["+"]");
	for(int i=0; i<arr.length;i++)
		for(int j=i; j<arr.length;j++)
		{
			System.out.print("[");Func(i,j,arr);
			System.out.print("]");
			System.out.println();
		}
	
	}
	
	public static void Func(int i, int j, int[] arr)
	{
		for(;i<=j;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}*/

Scanner scn = new Scanner(System.in);
int size = scn.nextInt();
int[] arr=new int[size];
for(int i=0;i<size;i++)
{
	arr[i]=scn.nextInt();
}

for( int j=0; j<arr.length-1; j++)
{
	for(int k=1; k<arr.length-j; k++)
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

int[] arr={0,1,2,3,4,5};
Scanner scn = new Scanner(System.in);
int ip = scn.nextInt();
	int num1=arr[0];
	int num2=arr[1];
	if((arr[0]+arr[1])==ip)
		System.out.println(arr[0]+" and "+arr[1]);
	
for(int i=0; i<arr.length; i++)
{
	for(int j=i+1; j<arr.length;j++)
	{
		if((ip==(arr[i]+arr[j])))//&& ((arr[i]!=num1) || (arr[j]!=num2)) )
		{
		num1=arr[i];
		num2=arr[j];
		System.out.println(arr[i]+" and "+arr[j]);
		}
	}
	}
}}



		