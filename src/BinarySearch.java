import java.util.ArrayList;


public class BinarySearch {
	
	public void findInBinaryArray(Integer [] a ,int l ,int h ,Integer val)
	{
		Integer   mid ;
		if (l <= h )
			mid = (l+h)/2;
		else 
		{
			System.out.println("Not Found");
			return;
		}
		
		
		if ( ( a[mid] == val ) && ( mid == 0 || (a[mid-1] == 0) ) )
		{
			System.out.println("Found position : " + String.valueOf(mid) );
		}
		else if (  a[mid] < val )
		{
			findInBinaryArray(a , mid+1 , h , 1);
		}
		else 
		{
			findInBinaryArray(a , l , mid-1 , 1);
		}
	}
	public static void main ( String[] args)
	{
		Integer [] a = new Integer [10];
		a[0]=0;a[1]=0;a[2]=1;
		BinarySearch obj = new BinarySearch();
		obj.findInBinaryArray(a, 0, 2, 1);
	}
}
