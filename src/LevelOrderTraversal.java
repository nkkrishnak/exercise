import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import exercise.src.Node;


public class LevelOrderTraversal {

	 int arrayNodes[]  = new int[10];
	//https://www.geeksforgeeks.org/level-order-tree-traversal/
	public void levelTraversalWithQueue(Node n)
	{
		LinkedList<Node> parent = new LinkedList<Node>();
		LinkedList<Node> child = new LinkedList<Node>();
		Node pointer;
		pointer = n;
		parent.add(n);
		while (parent.size() > 0)
		{
		   pointer = parent.poll();
		   if (pointer != null )
		   {
			   if ( pointer.left != null)
				   parent.add(pointer.left);
			   if (pointer.right != null)
				   parent.add(pointer.right);
			   child.add(pointer); // U don't need this if u need to print this.
		   }
		}
		Iterator<Node>x = child.iterator();
		while(x.hasNext())
			System.out.println(x.next().value);
		
	}
	
	public int findHeight(Node n)
	{
		if ( n == null )
			return 0;
		int lh = findHeight(n.left);
		int rh = findHeight(n.right);
		if ( lh > rh )
			return 1+lh;
		else
			return 1+rh;
	}
	
	public void printKdistanceNodes(Node n , int k ,boolean spflag)
	{
		if (n == null)
			return ;
		if (k == 0)
		{
			System.out.println(n.value);
			
		}
		else
		 { 
			if (spflag)
			{
				printKdistanceNodes(n.left,k-1,spflag);
				printKdistanceNodes(n.right,k-1,spflag);	
			}
			else
			{
				printKdistanceNodes(n.right,k-1,spflag);
				printKdistanceNodes(n.left,k-1,spflag);
			}
		 }
	}
	
	public void printSpiral(Node n )
	{
		int height ;
		height = findHeight(n);
		boolean spflag = true;
		for ( int i = 0 ; i< height; i++)
		{
			printKdistanceNodes(n, i,spflag );
			spflag = !spflag;

		}
		
		
	}

	public static void main(String[] args)
	{
/*		                       4
	                      2         7
	                    1   3    6      9
	                           5   8  11*/     
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
		LevelOrderTraversal obj = new LevelOrderTraversal();
		//obj.levelTraversalWithQueue(root);
		//System.out.println(obj.findHeight(root));
		obj.printSpiral(root);		
	}
	
}
