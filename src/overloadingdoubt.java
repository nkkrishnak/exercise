
public class overloadingdoubt {
/*
	void draw (String ll)
	{
		System.out.println("circle");
	}*/
	
	 int draw (String kk)
	{
		System.out.println("circle");
		return 1;
	}

	
	public static void main (String [] args)
	{
		overloadingdoubt obj = new overloadingdoubt();
		obj.draw("df");
	}
}
