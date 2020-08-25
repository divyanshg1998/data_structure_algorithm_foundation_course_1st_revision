package Jan13_2018;

public class MaxFreqAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated metho.d stub
		String str="aabcccabchhhhh";
		Func(str);
		}
	
	public static void Func(String str)
	{
		int[] arr=new int[26];
		for(int i=0; i<str.length();i++)
		{
			int ch=str.charAt(i)-'a';
			arr[ch]++;			
		}
		
		int max=arr[0];int num=0;
		for(int i=1; i<26; i++)
		{
			if(arr[i]>max){
				max=arr[i];
				num=i;
			}}
		char ch=(char)(num+97);
		System.out.println(ch);
		}

}
