package com.exercise.binarytree;

public class NodePriority implements Comparable<NodePriority> {

	int x,y, value;
	public  NodePriority(int value,int x , int y) {
		this.x= x;
		this.y=y;
		this.value = value;
	}
	
	
	@Override
	public int compareTo(NodePriority o) {
		if (this.x == o.x)
		{	
//			System.out.println("curr value: "+this.value + "  compared Xindex:"+o.x+" ("+this.x+","+this.y+")"+"PriorIF:"+(this.x-o.x));
			return this.y-o.y;
		}
//		System.out.println("curr value: "+this.value + "  compared Yindex:"+o.y+this.value+" ("+this.x+","+this.y+")"+"prior:"+(this.y-o.y));
		return this.x-o.x;
		
	}
	

}
