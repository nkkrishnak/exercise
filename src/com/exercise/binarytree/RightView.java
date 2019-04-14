package com.exercise.binarytree;

import exercise.src.Node;

/*
 * Print Right View of a tree.
 * https://www.geeksforgeeks.org/print-right-view-binary-tree-2/
 */

public class RightView {
	
	int maxHeight = 0;
	
	public void printRightView(Node root , int height)
	{
		if (root == null)
			return;
		
		if (height > maxHeight)
		{
			System.out.println(root.value);
			maxHeight= height;
		}
		
		printRightView(root.right,height+1);
		printRightView(root.left, height+1);
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
		
		RightView rv = new RightView();
		rv.printRightView(root,1);
	}
}
