package Jan12_2019;

public class crossword_try_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char[][] arr = { 
		 { '+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
		 { '+', '-', '+', '+', '+', '+', '+', '+', '+', '+' },
		 { '+', '-', '+', '+', '+', '+', '+', '+', '+', '+' },
		 { '+', '-', '-', '-', '-', '-', '+', '+', '+', '+' },
		 { '+', '-', '+', '+', '+', '-', '+', '+', '+', '+' },
		 { '+', '-', '+', '+', '+', '-', '+', '+', '+', '+' },
		 { '+', '+', '+', '+', '+', '-', '+', '+', '+', '+' },
		 { '+', '+', '-', '-', '-', '-', '-', '-', '+', '+' },
		 { '+', '+', '+', '+', '+', '-', '+', '+', '+', '+' },
		 { '+', '+', '+', '+', '+', '-', '+', '+', '+', '+' } };
		 String[] str = {   "LONDON", "DELHI","ICELAND", "ANKARA" };
		Func(arr, str, 0);
	}

	public static void Func(char[][] arr, String[] str, int wpsf)

	{
		if (wpsf == str.length) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++)
					System.out.print(arr[i][j]);
					System.out.println();
		}
			return;
		}

		//way to find errors
		System.out.println(wpsf + " " + str[wpsf] + " " + "nodestart");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				
				if (arr[i][j] == '-' || arr[i][j] == str[wpsf].charAt(0)) {
					if (canPlaceHor(arr, i, j, str[wpsf])) {
						boolean[] overlap = new boolean[str[wpsf].length()];						
						placeHor(arr, i, j, str[wpsf], overlap);
						
						System.out.println(wpsf + " " + str[wpsf] + " " + "HOReestart");
						Func(arr, str, wpsf + 1);
						System.out.println(wpsf + " " + str[wpsf] + " " + "HOReend");
												
						unPlaceHor(arr, i, j, str[wpsf], overlap);
					}
					
					 if(canPlaceVer(arr,i,j,str[wpsf]))
					 {
					 boolean[] overlap=new boolean[str[wpsf].length()];
					 placeVer(arr, i, j, str[wpsf],overlap);
				
					 System.out.println(wpsf + " " + str[wpsf] + " " + "VEReestart");
					 Func(arr, str, wpsf + 1);					 
					 System.out.println(wpsf + " " + str[wpsf] + " " + "VEReend");
						
					 unPlaceVer(arr, i, j, str[wpsf],overlap);
					 }

					
				}
			}
		
		}
		//way to find errors
		System.out.println(wpsf + " " + str[wpsf] + " " + "nodeend");

	}

	public static boolean canPlaceHor(char[][] arr, int r, int c, String word) {
		// out of bound
		if (c + word.length() - 1 > arr[0].length - 1)
			return false;
		//perfectly packed with + placed before and after
		
		if (c > 0 && arr[r][c - 1] != '+')
			return false;						//note that all are fallacy
			
		if (c + word.length() - 1 < arr[0].length - 1
				&& arr[r][c + word.length()] != '+')
			return false;

		for (int i = 0; i < word.length(); i++) {
			if (arr[r][c + i] != '-' && arr[r][c + i] != word.charAt(i)) {
				return false;				
			}
		}

		return true;
	}

	public static void placeHor(char[][] arr, int r, int c, String word, boolean[] overlap) {
		for (int i = 0; i < word.length(); i++) {
			if (arr[r][c + i] == word.charAt(i)) {
				overlap[i] = false;
			}

			arr[r][c + i] = word.charAt(i);
		}

	}

	public static void unPlaceHor(char[][] arr, int r, int c, String word,
			boolean[] overlap) {
		for (int i = 0; i < word.length(); i++) {
			if (overlap[i] == true) {
				arr[r][c + i] = '-';
			}

		}

	}

	public static boolean canPlaceVer(char[][] arr, int r, int c, String word) {
		// all fallacy
		if (r + word.length() - 1 > arr[0].length - 1)
			return false;

		if (r > 0 && arr[r - 1][c] != '+')
			return false;

		if (r + word.length() - 1 < arr.length - 1
				&& arr[r+word.length()][c] != '+')
			return false;
		//System.out.println("loop ");
		for (int i = 0; i < word.length(); i++) {
			if (arr[r+i][c] != '-' && arr[r+i][c] != word.charAt(i)) {
				//System.out.println("false");
				return false;
				}
		}

		return true;
	}


	public static void placeVer(char[][] arr, int r, int c, 
			String word, boolean[] overlap) {
		for (int i = 0; i < word.length(); i++) {
			if (arr[r+i][c] == word.charAt(i)) {
				overlap[i] = false;
			}

			arr[r+i][c] = word.charAt(i);
		}

	}

	public static void unPlaceVer(char[][] arr, int r, int c, String word, 
			boolean[] overlap) {
		for (int i = 0; i < word.length(); i++) {
			if (overlap[i] == true) {
				arr[r+i][c] = '-';
			}

		}

	}

}
