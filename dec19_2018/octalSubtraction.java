package dec19_2018;

public class octalSubtraction {
	
	public static void main(String[] args) {
		
//		 int a=11100;
//	int b=1;
	
		int a= 100000, b=1;
		int flag=0, flag1=0;
		int ans, pow=1, sum=0;
		
		while(a!=0 || b!=0)
		{
			if(a<b)
				{
				int c=b; b=a; a=c;
				flag1=1;
				}
				
			int num1= a%10;
			int num2= b%10;
			
			if (flag==1)
				num1--;
			
			flag=0;//special case 
			// when a=11100
			//b=1
			
			if(num1<num2)
				{
				ans=num1+8-num2;
				flag=1;
				}
			else 
			{
				ans=num1-num2;
			}
			sum=sum+ans*pow;
			pow*=10;
			a/=10;
			b/=10;	 
			
			
			 
			 
		
		}
		if(flag1==1)
			System.out.print("-");
		System.out.println(sum);

	
}
}