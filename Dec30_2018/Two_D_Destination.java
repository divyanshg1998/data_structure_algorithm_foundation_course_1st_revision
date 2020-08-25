package Dec30_2018;

import java.util.ArrayList;

public class Two_D_Destination {

	public static void main(String[] args) {

		ArrayList<String> arr=new ArrayList<>();
		arr= getmp(0,0,2,2);
		System.out.println(arr);
	}
	
	public static ArrayList<String> getmp(int sr, int sc, int dr,
			int dc){
		if(sr==dr && sc==dc){
		ArrayList<String> arr=new ArrayList<>();
		arr.add("");
		return arr;	
		}
		
		ArrayList<String> vvres=new ArrayList<>();
		if(sr<dr)
		{	
			ArrayList<String> vres=new ArrayList<>();
			vres=getmp(sr+1, sc, dr,dc);
		
			for(String val:vres){
				vvres.add("V"+val);
				}
			
		}
		
		if(sc<dc)
		{	ArrayList<String> hres=new ArrayList<>();
			hres=getmp(sr,sc+1,dr,dc);
			for(String val:hres){
				vvres.add("H"+val);
			}
		
		}
		return vvres;
		
	}
}
