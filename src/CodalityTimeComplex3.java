	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.TreeSet;


public class CodalityTimeComplex3 {

	public static int solution(int A[])
	{
		/*TreeSet<Integer>  ts = new TreeSet<Integer>();
		ArrayList <Integer> al = new ArrayList<Integer>();
		
		for (int i =0 ; i < A.length;i++)
		{
	
			if (ts.floor(A[i]) != null && (A[i] - ts.floor(A[i]) > 1))
			{
				for(int j =1;j<(A[i]-ts.floor(A[i]));j++)
					if (! al.contains(ts.floor(A[i])+j))
						al.add(ts.floor(A[i])+j);
			//	al.add(ts.floor(A[i])+1);
			}
			else if (ts.ceiling(A[i]) != null)
			{
				
				for(int j =1;j<(ts.ceiling(A[i])-A[i]);j++)
					if (! al.contains(A[i]+j))
						al.add((A[i])+j);
			
				al.add(A[i]+1);
			}
			
			if (al.contains(A[i]))
				al.remove(al.indexOf(A[i]));
			
			    
			ts.add(A[i]);
			
			//System.out.println(ts.ceiling(A[i]));
		}
		//System.out.println(ts);
		//System.out.println(ts.floor(0));
		//System.out.println(al); 
		
		if(!al.isEmpty())
		return al.get(0);
		
		return 0;*/
		
		  int N = A.length + 1;
          int total = N * (N + 1) / 2;

          for (int i : A) {

              total -= i;
          }

          System.out.println(total);
          return total;
		
		
	}
	
	
	
	public static void main(String [] args)
	{
	//	int a [] = {1,5,3,2};
	    int a[] = {};
		CodalityTimeComplex3.solution(a);
	}
	
	
	
}
