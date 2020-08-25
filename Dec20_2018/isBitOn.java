package Dec20_2018;

public class isBitOn {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(57));
		CheckTheBit(57, 3);
		TurnTheBitOn(57, 2);
		TurnTheBitOff(57, 3);
		ToggleTheBit(57, 3);
	}

	public static void CheckTheBit(int num, int k) {
		int bm = (1 << k) ;

		if ((bm & num) == bm) {
			System.out.println("On");
		} 
		else
			System.out.println("Off");

	}

	public static void TurnTheBitOn(int num, int k) {

		int bm = 1 << k;
		num = (bm | num);

		System.out.println(Integer.toBinaryString(num));
	}

	public static void TurnTheBitOff(int num, int k) {

		int bm = 1 << k;
		num = ~bm & num;
		System.out.println(Integer.toBinaryString(num));
	}
	
}