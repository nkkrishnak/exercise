package com.exercise.binarytree;

import exercise.src.Node;

public class NodeAtKDistanceFromLeaf {

	public int printNodes(Node root , int k )
	{
		
		if ( root == null )
			return 0;
		
		if ( root.left == null  && root.right == null )
		{
			return 1;
		}
		
		int ldist = printNodes( root.left, k);
		int rdist = printNodes(root.right, k);
		if ( ldist > -1  || rdist > -1 )
		{
			if (ldist == k || rdist == k )
				System.out.println(root.value);
			
			if ( ldist > rdist )
				return ldist+1;
			else 
				return rdist+1;
		}
		return -1;
	}
	
	public static void main(String[] args)
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
		
		NodeAtKDistanceFromLeaf obj = new NodeAtKDistanceFromLeaf();
		obj.printNodes(root, 3);
	}
}
