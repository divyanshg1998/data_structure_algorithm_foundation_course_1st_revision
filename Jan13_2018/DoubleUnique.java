package Jan13_2018;

public class DoubleUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 3, 2, 1 };
		Func(arr);
	}

	public static void Func(int[] arr) {
		int res = 0;
		int no1 = 0, no2 = 0;
		// shortcut
		for (int num : arr) 
			res ^= num;
		

		int num = res & (-res);
		// we ,and res with its 2's complement
		for (int no : arr) {
			if ((no & num) == num)
				no1 = no1 ^ no;
			else {
				no2 = no2 ^ no;
			}
		}
		System.out.println(no1 + " " + no2);
	}
}
