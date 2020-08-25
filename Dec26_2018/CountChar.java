package Dec26_2018;

public class CountChar {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("aaabbbccddeff");
				int cnt=1;
				int ctr = 1;
				for (int i = 0; i < sb.length()-1 ; i++) {
			if (sb.charAt(i) == sb.charAt(i + 1))
				ctr++;
			else {
				System.out.print(sb.charAt(i) + " " + ctr+" ");
				ctr = 1;
			}
				}System.out.println(sb.charAt(sb.length()-1)+" "+ctr);
	}
//StringBuilder to String sb.tostring();
}
