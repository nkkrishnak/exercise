package com.exercise.binarytree;

import java.util.Iterator;
import java.util.PriorityQueue;

import exercise.src.Node;

public class PrintBinaryTreeVertical {

	PriorityQueue<NodePriority> pq = new PriorityQueue<NodePriority>();

	public void axisIterate(Node n , int x , int y )
	{
		if (n==null)
			return;

		pq.add(new NodePriority(n.value,x,y));
 		axisIterate(n.left,x-1,y+1);
		axisIterate(n.right,x+1, y+1);
	}
	
	public void printQueue()
	{
        while ( !pq.isEmpty())
        {
        	System.out.println(pq.poll().value);
        }
	}
	public void btVertical(Node node){

		axisIterate(node,0,0);
		printQueue();
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
		PrintBinaryTreeVertical obj = new PrintBinaryTreeVertical();
		obj.btVertical(root);
	}

}
