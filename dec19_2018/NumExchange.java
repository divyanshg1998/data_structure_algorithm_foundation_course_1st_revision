package dec19_2018;

public class NumExchange {
	public static void main(String[] args){
		
		int ctr=3; int pow=1, rem; int num=2345678;
		int sum=0;
				
		for(int i = 1 ; i <= 3; i++)
		{
			rem=num%10;
			sum=sum+pow*rem;
			pow*=10;		
			num=num/10;
		}
		
		
		int sum2=0;
		pow=1; 
		for(int j=1; num!=0 ; j++)
		{
			rem=num%10;
			sum2=sum2+(rem*pow);
			pow*=10;
			num=num/10;
		}
		
		System.out.print(sum);
		System.out.print(sum2);
		
	}

}

/*
public static int Function(int sb)
{
return sb;
}
*/