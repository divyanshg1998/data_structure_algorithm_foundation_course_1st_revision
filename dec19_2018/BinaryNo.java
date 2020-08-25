package dec19_2018;

public class BinaryNo {
	public static void main(String[] args) {
	
	int num=57, sum = 0, rem=0, pow=1;
	
	while(num!=0)
	{
		rem=num%2;
		sum=sum+rem*pow;
		pow*=10;
		
		num=num/2;				
	}
	System.out.println(sum);
}
}
