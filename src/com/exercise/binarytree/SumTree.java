package com.exercise.binarytree;

import exercise.src.Node;

public class SumTree {

	private int lsum ;
	private int rsum ;
	private int temp ;
	public int doSum (Node n )
	{
		if (n==null)
			return 0;
		
		temp = n.value;
	
		if ( n.left == null && n.right == null )
			{ 
			    n.value = 0;
			    return temp;
			}
		
		lsum = doSum(n.left);
		rsum = doSum(n.right);
		
		n.value =   lsum + rsum;
		if ( n.value == 40 )
				{
			      System.out.println(n.value);
			      System.out.println(lsum);
				  System.out.println(rsum);
				}
		return n.value + temp ;
	}
	
	
	public void printPostorder(Node n)
	{
		if ( n== null)
			return;
		
		printPostorder(n.left);
		printPostorder(n.right);
		
		System.out.println(n.value);
				
	}
	public void computeSum (Node n)
	{
		doSum(n);
		printPostorder(n);
		
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
		
		SumTree obj = new SumTree();
		obj.computeSum(root);
	}
}
