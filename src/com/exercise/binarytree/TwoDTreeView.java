package com.exercise.binarytree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import exercise.src.Node;

/*
 * Print Tree in 2 diamentions
 * https://www.geeksforgeeks.org/print-binary-tree-2-dimensions/
 */

public class TwoDTreeView {
	
	LinkedHashMap<Node, Integer> nodeMap=  new LinkedHashMap<Node,Integer>();
	public void TwoDTreeLevel(Node root , int level )
	{
		if (root == null)
			return;
		
		
		TwoDTreeLevel(root.right,level+1);
		nodeMap.put(root,level);
		TwoDTreeLevel(root.left, level+1);
	}
	
	public void printMap()
	{
		for ( Map.Entry<Node,Integer> map : nodeMap.entrySet())
		{
			System.out.println();
			map.getKey();
			for ( int i = 0 ; i <= map.getValue(); i++)
				System.out.print("      ");
			System.out.print(map.getKey().value);
		}
	}
	
	public void printTwoDTree(Node root)
	{
		TwoDTreeLevel(root, 0);
		printMap();
		
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
	   
		TwoDTreeView viewObj  = new TwoDTreeView();
		viewObj.printTwoDTree(root);
	}

}
