package Dec27_2018_recursion;

public class Rec_easy {

	public static void main(String[] args) {
		int var=pow(3,4);
		System.out.println(var);
	}

	public static int pow(int x, int n) {
		
		if(n==0)
			return 1;
		return x*pow(x,n-1);
		
}}
