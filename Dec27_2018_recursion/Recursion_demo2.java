package Dec27_2018_recursion;

import java.util.Scanner;

public class Recursion_demo2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ip = scn.nextInt();
		
		Func(ip);
	}
	public static void Func(int x) {
		if (x==0)
			{return;}

		if(x%2!=0)
		System.out.println(x+" ");	Func(x-1);if(x%2==0)
		System.out.println(x+" ");
		
	
		
	}		
}
