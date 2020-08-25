package Jan13_2018;

public class PolnExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getExp(2, 3));
	}

	public static int getExp(int x, int n) {

		int sum = n * x;
		n--;
		int pow = x;
		for (; n > 0; n--) {
			x = x * pow;
			sum += n * (x);
		}
	return sum;
	}
}
