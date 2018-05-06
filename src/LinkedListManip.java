
public class LinkedListManip {

	
	public Node reverseLinkedList(Node head, int k)
	{
		Node nextNode= null;
		Node prevNode=null;
		Node currNode=head;
		int count =0;
		while (currNode != null && count < k)
		{
			nextNode=currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
			count++;
		}

		if ( nextNode != null )
			{ head.next=reverseLinkedList(nextNode, k);}
		return prevNode;
	}
	
	
	public void printLlist(Node n)
	{
		while (n!=null)
			{
			System.out.println(n.data);
		    n=n.next;
			}
	}
	public static void main(String[] args)
	{
		LinkedListManip obj = new LinkedListManip();
		Node n1 = new Node();
		n1.data = 1;
		Node n2 = new Node();
		n2.data = 2;
		Node n3 = new Node();
		n3.data = 3;
		Node n4 = new Node();
		n4.data = 4;
		Node n5 = new Node();
		n5.data = 5;
		Node n6 = new Node();
		n6.data = 9;

		n1.next = n2;

		n2.next=n3;

		n3.next = n4;
		
		n4.next=n5;
		
		n5.next = n6;
		
		n6.next= null;
		
		//obj.printLlist(n1);
		obj.printLlist(obj.reverseLinkedList(n1, 3));
	}
	
	public static class Node
	{
		int data;
		Node next = null;
	}
}
