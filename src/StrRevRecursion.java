import java.util.Scanner;


public class StrRevRecursion {

	
	static String strRev(String s1)
	{
		if ((s1.length() <= 1) || (s1 == null))
		{
			return s1;
		}
		
		return(strRev(s1.substring(1)) + s1.charAt(0));
		
	}
	
			
	
	
	public static  void main(String [] args)
	{
	System.out.println(args.toString());
	  Scanner s = new Scanner(System.in);
	  System.out.println(strRev(s.next()));
	}
	

}
