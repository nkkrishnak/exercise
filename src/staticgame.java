
public class staticgame {

	//static StringBuilder var = new StringBuilder();
	public static void display(StringBuilder arg, Integer i)
	{
		arg = arg.replace(0, 3, "old");
		i=5;
		
	}
	
	public static void main( String [] args)
	{
	
	 staticgame g1 = new staticgame();
	 StringBuilder var = new StringBuilder();	
	 var = var.append("new value");
	 Integer k = 9;
		display(var,k);
		System.out.println(var + String.valueOf(k));
	}
	
}
