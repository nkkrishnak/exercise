package com.exercise.binarytree;

import java.util.Stack;

import exercise.src.Node;

public class PrintPathToNode {
	
	Stack<Integer> s1 = new Stack<Integer>();
 	
	public boolean printPathToNode (Node root , int value)
	{
		if (root == null )
			return false;
		
		
		if (root.value == value)
			return true;
		
		if ( printPathToNode(root.left , value) || printPathToNode(root.right , value))
		{
			s1.push(root.value);
			return true;
		}
//		if ( printPathToNode(root.right , value) )
//		{
//			s1.push(root.right.value);
//			return true;
//		}
		return false;
	}
	
	public static void main( String[] args )
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
		PrintPathToNode obj  = new PrintPathToNode();
		obj.printPathToNode(root, 11);
		System.out.println(obj.s1.toString());
	}

}
