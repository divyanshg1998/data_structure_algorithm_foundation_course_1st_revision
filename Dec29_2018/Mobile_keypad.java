package Dec29_2018;

import java.util.ArrayList;

public class Mobile_keypad {
	
	public static void main(String[] args) {
		String str="359";
		ArrayList<String> test2=new ArrayList<>();
		test2=getKPC(str);
		System.out.println(test2);
	}	
	
	static String[] codes={".","abc","def","ghi","jkl","mno",
			"pqr","stu","vwx","yz"};
	
	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;

		}
		char ch = str.charAt(0);
		String ros = str.substring(1);// bc
		ArrayList<String> prevRes = getKPC(ros);// bc
		ArrayList<String> res = new ArrayList<>();

		String code = codes[ch - '0'];/// abc

		for (String val : prevRes) {

			for (int i = 0; i < code.length(); i++) {
				char ch1 = code.charAt(i);
				res.add(ch1 + val);

			}
		}
		return res;

	}}