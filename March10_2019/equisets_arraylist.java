package March10_2019;

import java.util.ArrayList;

public class equisets_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		ArrayList<Integer> asf1 = new ArrayList<>();
		ArrayList<Integer> asf2 = new ArrayList<>();
		equisets(arr, 0, asf1, 0, asf2, 0);
		System.out.println(ctr);
		// to avoid mirror images
		System.out.println();
		System.out.println("<------------------>");
		ctr=0;
		asf1.add(arr[0]);
		equisets(arr, 1, asf1, arr[0], asf2, 0);
		System.out.println(ctr);

	}

	public static int ctr = 0;

	public static void equisets(int[] arr, int indx, ArrayList<Integer> asf1, int sos1, ArrayList<Integer> asf2,
			int sos2) {

		if (indx == arr.length) {
			if (sos1 == sos2)// cant use here
			{
				ctr++;
				System.out.println(sos1);
				System.out.println(asf1);
				System.out.println(asf2);
				System.out.println("<==========>");
			}
			return;
		}
		asf1.add(arr[indx]);
		equisets(arr, indx + 1, asf1, sos1 + arr[indx], asf2, sos2);
		asf1.remove(asf1.size() - 1);
		asf2.add(arr[indx]);
		equisets(arr, indx + 1, asf1, sos1, asf2, sos2 + arr[indx]);
		asf2.remove(asf2.size() - 1);
	}

}
























