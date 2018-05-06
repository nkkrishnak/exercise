import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class StringManipulations {

	
	 public void charCount (StringBuilder str)
	 {
	   HashMap<Character, Integer> hmap = new HashMap<Character,Integer>();
	   for (int i=0;i<str.length();i++)
	    {
			 if (hmap.containsKey(str.charAt(i)))
			 {
				 int count;
				 count = hmap.get(str.charAt(i));
				 count++;
				 hmap.put(str.charAt(i), count);
			 }
			 else
			 hmap.put(str.charAt(i), 1);
		 }
       for (Character key : hmap.keySet())
       {
    	   System.out.println(key.toString() + "  " + hmap.get(key));
       }
	    	 
	    
	 }
	 
	 public String strRev (String str)
	 {
		 
	if  (str.length() == 1 )
		return str;
	else
		return (str.charAt(str.length()-1) + (strRev (str.substring(0,(str.length()-1)))) );
	 }
	 
	 public String charRev(String str)
	 {
		//char rev without repeat AZ int qn
	    Set<Character> charSet = new LinkedHashSet<Character>();
        for (int i = str.length()-1;i>=0;i--)
        {
          charSet.add(str.charAt(i));
        }
        return charSet.toString();
	 }
	   
	public static void main (String [] args)
	{
		String var1 = "hai";
		String var2 = var1;
		var1= "changed";
		System.out.println(var1 + "var2 "+ var2 );
		
		StringManipulations strObj = new StringManipulations();
		strObj.charCount(new StringBuilder("hellllo"));
        System.out.println(strObj.strRev("der"));
		System.out.println("charRev : "+ strObj.charRev("aabdceaaabbbcd"));
	}
}
