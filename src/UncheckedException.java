public class UncheckedException {

	public static void main (String [] arg)
	{
		String ll = null;
		try
		{
			System.out.println(ll.charAt(0));
			
			}
		
		catch(NullPointerException e)
		{
			System.out.println("hello");
			ll="good";
		//	e.printStackTrace();
		}
		
		finally
		{
			System.out.println(ll.charAt(0));
		}
	}

}
