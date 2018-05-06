import java.util.Arrays;


public class ArrayUnionIntersection {

	// Find union and intersection of given two arrays.
	public void findUandI(int[] a, int[] b){
		int ai=0 ,bi=0 , ui=0,ii=0 ;
		int[]u = new int [10];
		int[]i =  new int [10];
		for (ai = 0 ; ai <= (a.length -1) && bi <= (b.length-1);)
		{
			if (a[ai] < b[bi])	
			{ 
				u[ui] = a[ai];
				ai++;
				ui++;
			}
			else if (a[ai] > b[bi])
			{
				u[ui]=b[bi];
				bi++;
				ui++;
			}
			else
			{
				i[ii]=a[ai];
				u[ui] = a[ai];
				ai++;bi++;ii++;ui++;
			}
		}
		
		while (ai < a.length)
		{
			u[ui]= a[ai];
			ui++;ai++;
		}
		
		while(bi < b.length)
		{
			u[ui]=b[bi];
			ui++;bi++;
		}
			System.out.println(Arrays.toString(u));
			System.out.println(Arrays.toString(i));

	}
	
	//http://www.geeksforgeeks.org/merge-two-sorted-arrays-o1-extra-space/
	public void mergeTwoSortedArrays(int[]a,int[]b)
	{
		int ai=0,bi=0;
		while(ai<a.length)
		{
			if (a[ai]  < b[bi])
			{ 
				ai++;
			}
			else if (a[ai] > b[bi])
			{
				int temp = b[bi];
				b[bi] = a[ai];
				a[ai]=temp;
				ai++;

				int tbi=bi+1;
				int btemp = b[bi];
				if ( b[bi] > b[tbi])
				{
					while ((tbi < b.length) && (btemp >  b[tbi]))
					{
						b[bi] = b[tbi];
						tbi++;
						bi++;
					}
				}
				b[bi]=btemp;
				bi=0;
			}
			else
			{
				ai++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args)
	{
		int[] a = {1,3,4,5,7,8,11 };
		int[] b = {2,3,5,6,9};
		ArrayUnionIntersection arr = new ArrayUnionIntersection();
		//arr.findUandI(a, b);
		int[] a1 =  {1, 5, 9, 10, 15, 20};
		int[] b1 = {2, 3, 8, 13};
		arr.mergeTwoSortedArrays(a1, b1);
		int[] test =  {};
		test[0]=0;
		System.out.println(test.length);
	}
}
