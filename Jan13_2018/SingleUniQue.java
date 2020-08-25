package Jan13_2018;

public class SingleUniQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,3,2,1};
		
		System.out.println(Func(arr));
	}
	
	public static int Func(int[] arr)
	{
		int res=0;
	for(int i=0;i<arr.length;i++)
	{
		int num=arr[i];
		res^=num;
		}
	return(res);
		
	}

}
