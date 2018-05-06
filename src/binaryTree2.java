
public class binaryTree2 {

  static	Node root = null;
	
	public void addToNode (int key)
	{
		Node newNode = new Node();
		newNode.key = key;
		
		if (root == null )
		{
			root= newNode;
			return;
		}
		
		Node focusNode = root;
	
		while (true)
		{
			Node parent = focusNode ;
			
			if( focusNode.key > key)
			{
				focusNode=focusNode.left;
				
				if (focusNode == null)
				{
					parent.left=newNode;
					break;
				}
			}
			else
			{
				focusNode=focusNode.right;
				
				if (focusNode == null)
				{
					parent.right=newNode;
					break;
				}
			}
			
		}
		
	}

	
	public void inordertraversal (Node node)
	{
		if(node != null)
		{
			inordertraversal(node.left);
			System.out.println(node.key);
			inordertraversal(node.right);
		}
	}
	
	public void preordertraversal (Node node)
	{
		if(node != null)
		{
		System.out.println(node.key);
		preordertraversal(node.left);
		preordertraversal(node.right);
		}
	}
	
	public void postordertraversal (Node node)
	{
		if(node != null)
		{
		postordertraversal(node.left);
		postordertraversal(node.right);
		System.out.println(node.key);
		}
	}
	
	public int findElement(int key)
	{
		Node focusNode = root;
		int depth = 0;
		while(focusNode.key != key)
		{
			if(focusNode.key > key)
			{
				focusNode = focusNode.left;
			}
			else
				focusNode = focusNode.right;
			
			if(focusNode == null)
				return -1;
			
			depth++;
		}
		return  depth;
	}
	

	public void sameDepthElements(int depth)
	{
	    int i=0;
	    Node lfocusNode = root;
	    Node rfocusNode = root;
	    
	    if(depth == 0)
	    {
	    	System.out.println(root.key);
	    	return;
	    }
	    
		while (i < (depth-1))
		{
			if ( lfocusNode.left != null )
				 lfocusNode = lfocusNode.left;
			
			if (rfocusNode.right != null)
				rfocusNode = rfocusNode.right;
			i++;
		}
		
		if (lfocusNode.left != null)
			System.out.println(lfocusNode.left.key);
		

		if (lfocusNode.right != null)
			System.out.println(lfocusNode.right.key);

		if (rfocusNode.left != null)
			System.out.println(rfocusNode.left.key);
		

		if (rfocusNode.right != null)
			System.out.println(rfocusNode.right.key);

		
	}
	
	
	public static void main (String [] args)
	{

		binaryTree2 bt = new binaryTree2();
		bt.addToNode(9);
		bt.addToNode(7);
		bt.addToNode(2);
		bt.addToNode(4);
		bt.addToNode(10);
		bt.addToNode(12);
		bt.addToNode(3);
		bt.addToNode(1);
		bt.addToNode(13);
		bt.addToNode(14);
		bt.addToNode(5);
		bt.addToNode(0);
		//	bt.inordertraversal(root);
		//bt.postordertraversal(root);
		//System.out.println(bt.findElement(1));
		bt.sameDepthElements(4);
	}
	
	
	class Node			
	{
		int key;
	    Node left = null;
	    Node right = null;
	    
	}
}
