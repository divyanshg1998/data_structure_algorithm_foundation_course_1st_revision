package March11_2019;

import java.io.*;
import java.util.*;

public class Soduku_try_2 {

	public static void main(String[] args) {

		/*
* Enter your code here. Read input from STDIN. Print output to STDOUT. Your
* class should be named Solution.
*/

// Scanner scn =new Scanner(System.in);
// int a= scn.nextInt();
// int b=scn.nextInt();

int a=new int(456); 
int b=173;

int c=0;
// int carry=0;
int power=1;

while(a != 0 ){

int a1=a%10;
int b1=b%10;

if(a1<b1){
func(a,b,c,a1,b1,1);
}
c+=((a1-b1)%8)*power;

power*=10;
a/=10;
b/=10;
}
System.out.println(c);
}
public static void func(int a, int b, int c,int a1,int b1, int power){
int a2=a%100;
int b2=b%100;

if(a2==0){
func(a,b,c,a2,b2,power*10);
}

else{
a-=10*power;
a1+=8;
}
}
}


