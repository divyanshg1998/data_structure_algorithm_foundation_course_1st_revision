package Jan2_2018_perm_comb;

public class Queen_comb_way2 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Func(0, 4, 0, 2, "");
	}

	

	public static void Func(int boxno, int boxes, int qno, int queen, String str) {
		if (qno == queen) {
			System.out.println(str);
			return;
		}
		if (boxno == boxes) {
			return;
		}

		Func(boxno + 1, boxes, qno + 1, queen, str + "Q" + (qno + 1) +"B"+boxno+" ");

		Func(boxno + 1, boxes, qno, queen, str);

	}
}