package Jan2_2018_perm_comb;

public class QuuenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//plACE 2 queens at 4 boxes and generate all combination
		 //Func2(new boolean[4], 0, 2, "", 0);
		System.out.println();
		
		// Func(new boolean[4], 0, 2, "");
		System.out.println();
		// FuncBits(4, 0, 2,"");
		
		//place 4 queens in a 4 by 4 chess board so that none cut none
			Queen2D(new boolean[4][4], 0, "", 0);

	}
	/*
	 * public static void Func(int boxes, int qno, int qplaced, String path) {
	 * if(qno==qplaced) { System.out.println(path); return; } for(int i=0;
	 * i<boxes; i++) { if(boxes[i]==false){ boxes[i]=true; Func(boxes, qno+1,
	 * qplaced, path+ "Q"+(qno+1)+"b"+ i); boxes[i]=false; } } }
	 */

	public static void Func2(boolean[] boxes, int qno, int qplaced,
			String path, int num) {
		if (qno == qplaced) {
			System.out.println("    " + path);
			return;
		}

		for (int i = num; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;

				Func2(boxes, qno + 1, qplaced, path + "Q" + 
				(qno + 1) + "b" + i, i + 1);
				boxes[i] = false;
			}
		}
	}

	static int count = 0;

	public static void Queen2D(boolean[][] boxes, int qno,
			String path, int num) {
		if (qno == boxes.length) {
			System.out.println(++count + " " + path);
			return;
		}
		for (int row = num; row < boxes.length; row++) {
			for (int col = 0; col < boxes.length; col++) {
				if (boxes[row][col] == false) {
					boxes[row][col] = true;

					boolean num2 = IsSafe(boxes, row, col);
					if (num2 == true) {
						Queen2D(boxes, qno + 1, path
								+ "Q" + (qno + 1) + "b" + row, row + 1);
					}

					boxes[row][col] = false;
				}
			}
		}

	}

	public static boolean IsSafe(boolean[][] boxes, int row, int col) {
		int[][] allDir = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, 1 }, { 0, -1 } };
		int a = 1;
		for (int[] dir : allDir) {

			int rowDelta = dir[0];
			int colDelta = dir[1];
			for (int dis = 1; dis < boxes.length; dis++) {

				int newRow = row + rowDelta * dis;
				int newCol = col + colDelta * dis;

				if (newRow < boxes.length && newRow >= 0 && newCol < boxes.length && newCol >= 0
						&& boxes[newRow][newCol] == true) {
					return false;
				}

			}
		}

		return true;
	}
}
