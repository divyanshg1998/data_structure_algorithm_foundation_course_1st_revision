package Dec20_2018;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int arr[];
		int num2;
		int i;
		for(i=0; i<num; i++)
		{
			 num2 = scn.nextInt();
			 arr[i]=num2;
		}
	
		boolean var1=true, var2=true;
		int a=arr[0];
		for(i=1;i<num;i++)
		{

			if(arr[i]<a)
			break;
			a=arr[i];
			}
		a=arr[i];
		i++;
		/*for(;i<num;i++)
		{
			if(arr[i]>a);
			var2=false;
			}
		if(arr[1]>arr[0])
			var2=false;
		
		System.out.println(var2);

	}
}
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int ctr = scn.nextInt();
		int count=0,rem; 	
		/*while(num!=0)
		{
			rem=num%10;
			if(ctr==rem)
				count++;
			num/=10;
		}
		System.out.println(count);
*/
		
		
}}