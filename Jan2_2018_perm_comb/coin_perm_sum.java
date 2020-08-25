package Jan2_2018_perm_comb;

public class coin_perm_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum=10
		int[] coin={2,3,5,6};
		Func(coin,10,"");
		System.out.println(ctr);
		Func2(coin,10,"",0);
		System.out.println(ctr-17);
		}

	static int ctr = 0;

	public static void Func(int[] coin, int amount, String str) {
		if (amount == 0) {
			ctr++;
			System.out.println(str);
			return;
	}
		if (amount < 0)
			return;

		for (int i = 0; i < coin.length; i++) {

			Func(coin, amount - coin[i], str + coin[i]);

		}

	}
	
	public static void Func2(int[] coin, int amount, String str,int num) 
	{
		if (amount == 0) {
			ctr++;
			System.out.println(str);
			return;
	}
		if (amount < 0)
			return;

		for (int i = num; i < coin.length; i++) {

			Func2(coin, amount - coin[i], str + coin[i],i);

		}

	}

}
