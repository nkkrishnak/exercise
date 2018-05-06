import java.util.regex.*;
public class regexManipl {

	public static void main (String[] args)
	{
	
	String input = "aaabbfooaabfooab";
	String regex = "a*b";
	
	Pattern pt = Pattern.compile(regex);
	Matcher mt = pt.matcher(input);
	
	while (mt.find())
	{
	  input=	mt.replaceAll("-");
	}
    
	System.out.println(input);
	
}
	
}
