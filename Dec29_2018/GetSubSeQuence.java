package Dec29_2018;

import java.util.ArrayList;

public class GetSubSeQuence {

	public static void main(String[] args) {
		String str="abc";
		ArrayList<String> test2=new ArrayList<>();
		test2=Get(str);
		System.out.println(test2);

		
		System.out.println();
		str="ab";
		ArrayList<String> test3=new ArrayList<>();
		//test3=getSubSequenceWithAscii(str);
		System.out.println(test3);
	}	
	
	public static ArrayList<String> Get(String str) 
	{
		if(str.length()==0)
		{
			ArrayList<String> test1=new ArrayList<>();
			test1.add("");
			return test1;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		System.out.println(ros);
		ArrayList<String> prevRes= Get(ros);
		ArrayList<String> res= new ArrayList<>();
		for(String ss: prevRes){
			res.add(ss);
			res.add(ch+ss);
		}
		return res;
			
		}
	/*
	public static ArrayList<String> getSubSequenceWithAscii(String str) {

		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;

		}s = str.substring(1);
		ArrayList<String> prevRes = getSubSequenceWithAscii(ros);// bc
		ArrayList<String> res = new ArrayList<>();
		for (String ss : prevRes) {
			res.add(
		char ch = str.charAt(0);
		String ross);
			res.add((int) ch + ss);
			res.add(ch + ss);
		}
		return res;

	}*/
	

}
