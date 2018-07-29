package com.exercise.binarytree;

import exercise.src.Node;

public class LowestCommonAncestor {
	
	public boolean findLCA(Node n , int a , int b)
	{
		if (n == null)
			return false;
		
		if (n.value == a)
		{
//			System.out.println(n.value);
			return true;
		}
		if (n.value == b ) 
		{
//			System.out.println(n.value);
			return true;
		}

		boolean lflag = findLCA(n.left,a,b);
		boolean rflag = findLCA(n.right,a,b);
		
		if ( lflag && rflag )
		{
			System.out.println(n.value);
			return false;
		}
		if (lflag || rflag )
		{ 
//			System.out.println(n.value);
			return true;
		}
		
		
		return false;
	}
	
	public void getLCA(Node n , int a , int b )
	{
		if (n.value == a || n.value == b) 
				System.out.println(n.value);
		else
			findLCA(n, a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		LowestCommonAncestor obj = new LowestCommonAncestor();
		
		obj.getLCA(root , 2,11 );

	}

}
