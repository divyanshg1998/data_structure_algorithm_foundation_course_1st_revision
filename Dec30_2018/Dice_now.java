package Dec30_2018;

import java.util.ArrayList;

public class Dice_now {
//<--------------------------------------------->
//reach from 0 to 10 via a dice of 1-6 
	public static void main(String[] args) {
		Func(0, 10, "");
		ArrayList<Integer> arr=new ArrayList();
		arr=Func2(0,10);
		for(int val: arr)
		{
			System.out.println(val);
		}
	}

	static int count = 0;

	public static void Func(int s, int d, String path) {
		if (s == d) {
			System.out.println(++count + " " + path);
		}
		for (int i = 1; (i <= 6 && (s + i) <= d); i++) {
			Func(s + i, d, path+i);
		}
	}

	public static ArrayList<Integer> Func2(int s, int d) {
		if (s == d) {
			ArrayList<Integer> arr=new ArrayList();
			return arr;
		}

		ArrayList<Integer> newarr=new ArrayList();
		
		for (int i = 1; (i <= 6 && (s + i) <= d); i++) {
			newarr=Func2(s + i, d);
			for(int value:newarr)
			{
				newarr.add(i);
			}
		}	
	}
}
