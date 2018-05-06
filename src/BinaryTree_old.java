public class BinaryTree_old {

	  Node root = new Node();
	 
	public void addToTree(int key , String name)
	{
		Node newNode = new Node();
		Node focusNode = new Node();
		
		newNode.key = key;
		newNode.name= name;
		
		if (root == null)
		{
			root = newNode;
		}
		
		else if(newNode.key < root.key)
		{
			focusNode = root.leftNode;
			
			while(true)
			{
				if (newNode.key < focusNode.key )
				{
					focusNode = focusNode.leftNode;
				}
				else
				{
					focusNode.rightNode = newNode;
                    break;
				}
					
			}
		}
		
		else
		{
			focusNode = root.rightNode;
			
			while (true)
			{
				if (newNode.key > focusNode.key)
					focusNode = focusNode.rightNode;
				else
				{
					focusNode.leftNode = newNode;
					break;
				}
					
			}
			}
			
		}
	
	public void inorderTraversal(Node currentNode)
	{
		if (currentNode != null)
		{
			inorderTraversal(currentNode.leftNode);
			System.out.println(currentNode);
			inorderTraversal(currentNode.rightNode);
		}
		}
		  
	public  static void main (String [] args)
	{
		
		BinaryTree_old bt = new BinaryTree_old();
		bt.addToTree(10,"A");
		bt.addToTree(20,"B");
		bt.addToTree(30,"C");
		bt.addToTree(10,"D");
		bt.addToTree(20,"E");
		bt.addToTree(30,"F");
	    
	    bt.inorderTraversal(bt.root);
	
	}
	
	public class Node
	{
		int key; 
		String name;
		
		Node leftNode = null;
		Node rightNode = null;
		
		public void Node(int key , String name)
		{
			this.key = key;
			this.name = name;
		}
	}
}