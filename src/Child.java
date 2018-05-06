
public class Child extends Parent {

	int x =1;
	public void print()
	{
		System.out.println("child");
	}
	
	public void  display()
	{
		System.out.println("diff");
	}
	
	public static void main(String [] args)
	{
		Parent p = new Child();
		System.out.println(p.x);
		p.print();
		//p.display();
	}
}
