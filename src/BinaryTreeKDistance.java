import exercise.src.Node;


public class BinaryTreeKDistance {

	int lflag = 0;
	int rflag = 0;
	public int getMax(int a,int b)
	{
		if (a > b)
			return a;
		else 
			return b;
	}
	public  int height(Node n)
	{
		if( n == null )
			return 0;
		return 1+ getMax(height(n.left),height(n.right)) ;
	}

	public void printKdistanceNodes(Node n , int k)
	{
		if ( n == null )
			return ;
		if ( k ==0 )
		{
			System.out.println(n.value);
		}
		else
		{	k=k-1;
			printKdistanceNodes(n.left, k);
			printKdistanceNodes(n.right, k);
		}
	}
	public boolean  ifLtree(Node n , Node x , int k )
	{
		if (n.value > x.value)
			return true;
		else
			return false;
	}
//	public void printKDistNodesFromGivenNode(Node n ,Node x ,int k )
//	{
//		int rootHeight , xHeight , diffHeight , lheight ;
//		rootHeight = height(n);
//		xHeight = height(x);
//		diffHeight = rootHeight - xHeight;
//		if ( ifLtree(n,x,k) )
//		{
//			printKdistanceNodes(n.left, k+diffHeight-1);
//			if( ( k-diffHeight-1 ) >= 0 )
//				printKdistanceNodes(n.right,k-diffHeight-1);
//			else if (k-diffHeight == 0 )
//			    System.out.println(n.value);
//			System.out.println("left done");
//		}
//		else
//		{
//			printKdistanceNodes(n.right, k+diffHeight-1);
//			System.out.println("r1 done");
//			if( ( k-diffHeight-1 ) >= 0 )
//				printKdistanceNodes(n.left,k-diffHeight-1);
//			else if (k-diffHeight == 0 )
//			    System.out.println(n.value);
//
//		}
//	}
	
	public Node findPredecessor(Node n,Node x)
	{
		if (n==null)
			return null;
		Node p = null;
		while ( n != null && n.value != x.value )
		{
		    if ( n.value >  x.value)
		    {
		    	p= n;
		    	n = n.left;
		    	lflag =1;
		    	rflag =0;
		    }
		    else if ( n.value  <  x.value)
		    {
		    	p= n;
		    	n = n.right;
		    	lflag=0;
		    	rflag=1;
		    }
		   
		}
		if (p != null)
		{	
//			System.out.println("ss");
//		    System.out.println(p.value);
			return p;
		}
		else 
			return null;
			
	}
	
	public void printKDistNodesFromGivenNode(Node n ,Node x ,int k )
	{
		printKdistanceNodes(x, k);
		int rootHeight = height(n);
		int xHeight = height(x);
		int diffHeight = rootHeight - xHeight;
		if ( ifLtree(n, x, k))
		{}
		else 
		{
			if ( k  < diffHeight)
				printKdistanceNodes(n.right,diffHeight-k -1);
			else if ( k == diffHeight )
			{
				printKdistanceNodes(n, 0);
				int i =1;
				while ( findPredecessor(n,x) != n)
				{
					Node p = findPredecessor(n,x);
					System.out.println("-"+p.value+(k-i));
					if (lflag == 1)
						printKdistanceNodes(p.right, k-i-1);
					else
						printKdistanceNodes(p.left, k-i-1);
					x=p;
					i++;
				}
			}
			else
			{
				int i =1;
				Node p = null;
				while ( findPredecessor(n,x) != n)
				{
					p = findPredecessor(n,x);
					System.out.println("-"+p.value+(k-i));
					if (lflag == 1)
						printKdistanceNodes(p.right, k-i-1);
					else
						printKdistanceNodes(p.left, k-i-1);
					x=p;
					i++;
				}
//				System.out.println("hehe");
//				System.out.println(lflag);
//				System.out.println(rflag);
				if ( p != n )
					printKdistanceNodes(n.left,k-diffHeight-1);
			}
		}	
	}
	
	public static void main(String[] args)
	{
		Node root = new Node(19);
		root.left = new Node(2);
		root.right = new Node(27);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(26);
		root.right.right = new Node(32);
		root.right.left.left = new Node(24);
		root.right.left.right = new Node(28);
		root.right.right.left = new Node(29);
		BinaryTreeKDistance obj = new BinaryTreeKDistance();
		//System.out.println(obj.height(root.left));
		//obj.printKdistanceNodes(root.right.right, 4);
	    obj.printKDistNodesFromGivenNode(root, root.right.left.left ,4);
	}
	
}
