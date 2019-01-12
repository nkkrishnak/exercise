package com.exercise.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Graph {
 
	// This graph implemenatation is based on adjacent List interpretation of
	// Graphs.
	HashMap<String, List<String>> adjList = new HashMap<String,List<String>>();
	
	public void addEdge(String key , String value  )
	{
		if (adjList.containsKey(key)){
			List<String> valueList = adjList.get(key);
			valueList.add(value);
			adjList.put(key, valueList);
		}
		else{
			List<String> valueList = new ArrayList<String>();
			valueList.add(value);
			adjList.put(key, valueList);
		}
			
	}
	
	public void printEdges()
	{
		for (  Map.Entry<String, List<String> > entry :adjList.entrySet() ){
			 List<String> ls = entry.getValue();
			 System.out.println("KEY :" +entry.getKey());
			 
			 for ( int i =0;i<ls.size();i++)
			 {
				 System.out.print("  "+ls.get(i));
			 }
			 System.out.println("+++++++++++++++++++");
		}
	}
	
	
}
