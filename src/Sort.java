
public class Sort {

	public int [] bubblesort(int a[])
	{
	  int len = a.length;
	  for (int i=0 ; i < len ; i++)
	  {
		  for (int j=0 ; j < len-1-i ; j++)
		  {
			  if (a[j] > a[j+1])
			  {
				  int temp = a[j];
				  a[j] = a[j+1];
				  a[j+1] = temp;
			  }
		  }
	  }
		 return a;
	}
	
	public static void main (String[] args)
	{
		int a[] = new int []{41,1,3,8,0};
        Sort bs = new Sort();
        int []result = bs.bubblesort(a);
        for (int i = 0 ; i < result.length;i++)
        	System.out.println(result[i]);
	}
}
