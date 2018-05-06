import java.util.ArrayList;
import java.util.Arrays;


public class arrayevenoddpartition {

	public int[] arrangeArray(int[]a)
	{
		int evenIndex =0;
		for(int i = 0 ; i < a.length-1;i++)
		{
			if ((a[i]%2 >0) && (a[i+1]%2>0) )
			{continue;}
			
			if ( (a[i]%2 >0) && (a[i+1]%2==0) )
			{
				int temp = a[i+1];
				a[i+1] = a[evenIndex];
				a[evenIndex] = temp;
				
			}
			
			evenIndex++;
		}
		return a;
	}
	
	
	public static	 void main(String [] args )
	{
		int a[] = {2,4,7,8,1,3,6,131,11,13,60};
		ArrayList <Integer> al = Arrays.asList(a);
		System.out.println("Index : "+al.get(2));
		arrayevenoddpartition obj = new arrayevenoddpartition();
		a=obj.arrangeArray(a);
		for(int i=0;i<a.length;i++)
			System.out.print("   "+a[i]);
	}
}
