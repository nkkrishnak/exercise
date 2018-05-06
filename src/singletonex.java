public class singletonex {

	public Integer marks = 0;
	private static singletonex objt = null;
	
	private singletonex() {
	}
	
	public static singletonex getInstance()
	{
		if (objt == null)
			objt = new singletonex();
		return objt;
	}
	
	
	public static void main (String [] args)
	{
		singletonex receivedObj = singletonex.getInstance();
		System.out.println(String.valueOf(receivedObj.marks));
		receivedObj.marks = 50;
		System.out.println(String.valueOf(receivedObj.marks));
		
		singletonex receivedObj2 = singletonex.getInstance();
		System.out.println(String.valueOf(receivedObj2.marks));
          
		singletonex ob = new singletonex();
        ob.marks = 10;
        System.out.println(ob.marks);
		
	}
}
