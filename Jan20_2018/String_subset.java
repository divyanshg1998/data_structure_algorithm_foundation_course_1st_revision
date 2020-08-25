
public class String_subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30};
		Func(arr,0,"");
	}
	public static void Func(int[] arr,int vidx, String set)
	{
		if(arr.length==vidx)
		{
			System.out.println(set);
			return;
		}
		Func(arr,vidx+1,set);

		Func(arr,vidx+1,set+arr[vidx]);
	
		
	}

}
