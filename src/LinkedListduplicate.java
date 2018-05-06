import java.util.ArrayList;


public class LinkedListduplicate {

	public Integer findDuplicate(Node n)
	{
		
		ArrayList<Node> al = new ArrayList<Node>();
		
		while(n != null)
		{
			if (al.contains(n.next))
				return n.next.value;
			al.add(n.next);
			n=n.next;
		}
		
		return null;
		
	}
	
	
	public static void main(String [] args)
	{
		LinkedListduplicate llObj = new LinkedListduplicate();
		Node ll1 = new  Node();
		Node ll2 = new  Node(); 
		Node ll3 = new Node();
		Node ll4 = new Node();
		
		
		ll1.value=1;
		ll2.value=2;
		ll3.value=3;
		ll4.value=4;
		
		
		ll1.next=ll2;
		ll2.next=ll3;
		ll3.next=ll4;
		ll4.next=ll3;
		
		System.out.println(llObj.findDuplicate(ll1));
		
	}
	
	
	
	
	 
}
