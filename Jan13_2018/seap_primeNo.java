package Jan13_2018;

public class seap_primeNo {

	public static void main(String[] args) {
		
		Func(100);
	}

	public static void Func(int n)
	{
	boolean[] strg=new boolean[n+1];
//all false are prime no
	strg[0]=true;
	strg[1]=true;
	
	for(int i=2; i*i<=n;i++)
	{
		if(strg[i]==false){
			for(int k=i; k*i<=100; k++)
			{
				strg[k*i]=true;
				}
		}
	}
	
	for(int i=0; i<=n; i++ )
	{
		if(strg[i]==false)
		System.out.print(i+" ");
	}
		
	}

}
