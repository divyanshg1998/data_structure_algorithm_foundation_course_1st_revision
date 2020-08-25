package Dec20_2018;
/* data type depiction*/

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		float a= 0;
		float b=300;

		while(a<=b)
		{
			int c=(int)((5.0/9)*(a-32.0));
			a+=20;
			System.out.println(c);
		}
	
	}

}
