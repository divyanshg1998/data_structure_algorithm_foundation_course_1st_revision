package Dec27_2018_recursion;

public class Recursion_demo {

	public static void main(String[] args) {
		// fpd(5);
		System.out.println();
		// fpi(5);
		System.out.println();
		fpid(5);
	}

	// expectation f(5)=1,2,3,4,5
	// faith f(4)=1,2,3,4
	public static void fpd(int x) {
		if (x == 0)
			return;
		System.out.println(x);
		fpd(x - 1);
	}

	public static void fpi(int x) {
		if (x == 0)
			return;
		fpi(x - 1);
		System.out.println(x);
	}

	public static void fpid(int x) {
		if (x == 0)
			return;
		System.out.println(x);
		fpid(x - 1);
		System.out.println(x);
	}
}