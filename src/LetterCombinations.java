import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class LetterCombinations {

	public static Set<String> decode(String code){
		return decode("", code);
	}
	
	private static Set<String> decode(String prefix, String code) {
		Set<String> set = new LinkedHashSet<String>();
		if (code.length() == 0) {
			set.add(prefix);
			return set;
		}
		if (code.charAt(0) == '0'){
			return set;
		}
	
		set.addAll(decode(prefix + (char) (code.charAt(0) - '1' + 'a'), code.substring(1)));
		
		if (code.length() >= 2 && code.charAt(0) == '1') {
			set.addAll(decode(prefix + (char) (10 + code.charAt(1) - '1' + 'a'), code.substring(2)));
		}
		if (code.length() >= 2 && code.charAt(0) == '2' && code.charAt(1) <= '6') {
			set.addAll(decode(prefix + (char) (20 + code.charAt(1) - '1' + 'a'), code.substring(2)));
		}
		return set;
	}
	
	
   public static void main(String[] args)
   {
	   
	   System.out.println(LetterCombinations.decode("1123"));
	   
	   String str = "2111";
	   System.out.println("ans" + (char) (str.charAt(0) - '1' + 'a'));
   }
}
