
public class interfaceimpl implements  interf {

	@Override
	public String draw() {
		System.out.println("Draw method called");
		return("success");
	}

	
	public static void main (String [] args)
	{
		System.out.println(cons);
		interfaceimpl intl =  new interfaceimpl();
		intl.draw();
	}
}
