package dec19_2018;

public class OctalAddition {
	public static void main(String[] args) {
		
//		int a=777, b=777;
		int num1,num2;
		int carry=0, ans, sum=0,pow=1;
		
		//test case special
				int a=55;
				int b=7733; 
				//ans=10010
				
		while(a!=0 || b!=0 || carry>0)
		{
			num1= a%10;
			num2= b%10;
			
			ans= (carry+num1+num2)%8;
			carry= (num2+num1)/8; //we add a carry here too
								//for test case
			sum= sum + ans*pow;
			pow*=10;
			a/=10;
			b/=10;
		}
		System.out.println(sum);
	}
		
}
