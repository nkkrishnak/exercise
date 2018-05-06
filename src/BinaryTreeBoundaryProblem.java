import java.util.Stack;

import exercise.src.Node;


public class BinaryTreeBoundaryProblem {
	private int firstnode = -1;
	private int lastleft ;
	private Stack<Integer> stck = new Stack<Integer>(); 
	public void printLeftNodes(Node n)
	{
		if ( n == null )
			return ;
		else
		{
			if ( firstnode == -1 )
				firstnode = n.value; 
			System.out.println(n.value);
			lastleft = n.value;
			printLeftNodes(n.left);
		}
	}

	public void printLeafNodes(Node n)
	{
		if ( n == null )
			return;
		if ( ( n.left == null ) && ( n.right == null )
		      && n.value != lastleft )
		{
			System.out.println(n.value);
			lastleft = n.value;
		}
		printLeafNodes(n.left);
		printLeafNodes(n.right);
	}

	public void printRightNodes(Node n)
	{
		if ( n == null )
			return ;
		else
		{
			if( ( n.value != lastleft ) &&  (n.value != firstnode ))
			{
				stck.push(n.value);
			//	System.out.println(n.value);
			}
		printRightNodes(n.right);
		 while ( !stck.isEmpty())
		 {
			 System.out.println(stck.pop());
		 }
		}
	}
	public static void main(String[] args )
	{
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(7);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(9);
		root.right.left.left = new Node(5);
		root.right.left.right = new Node(8);
		root.right.right.left = new Node(11);
		BinaryTreeBoundaryProblem obj = new BinaryTreeBoundaryProblem();
		obj.printLeftNodes(root);
		obj.printLeafNodes(root);
		obj.printRightNodes(root);

		
	}
}
