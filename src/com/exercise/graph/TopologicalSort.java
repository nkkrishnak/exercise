package com.exercise.graph;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class TopologicalSort {
	
	Set visitedList = new LinkedHashSet<String>();
	Stack tSorted = new Stack<String>();
	public  void tpSort(Graph obj){
		for (  Map.Entry<String, List<String> > entry :obj.adjList.entrySet() ){
			if (! visitedList.contains(entry.getKey()))
					tpSortUtil(obj,entry.getKey());
		}
	}
	

	private void tpSortUtil(Graph obj, String key) {
		
		List<String> childList = new ArrayList<String>();
		childList = obj.adjList.get(key);
		visitedList.add(key);

		if (childList != null)
		{
			for(int i = 0 ; i < childList.size(); i++)
			{
				if (! visitedList.contains(childList.get(i))){
					tpSortUtil(obj,childList.get(i));
				}
			}
		}
		tSorted.push(key);
	}
	
	private void printSorted() {
		
     	System.out.println(Arrays.toString(tSorted.toArray()));
	}


	public static void main(String[] args) {

		Graph graphObj = new Graph();
		graphObj.addEdge("A", "C");
		graphObj.addEdge("B", "C");
		graphObj.addEdge("B", "D");
		graphObj.addEdge("C", "E");
		graphObj.addEdge("E", "F");
		graphObj.addEdge("D", "F");
		graphObj.addEdge("F", "G");

		//graphObj.printEdges();
		TopologicalSort obj = new TopologicalSort();
		obj.tpSort(graphObj);
		obj.printSorted();
	}


}
