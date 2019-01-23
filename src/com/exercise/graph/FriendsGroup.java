package com.exercise.graph;

/*
There are N students in a class. Some of them are friends, while some are not. 
Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, 
then A is an indirect friend of C. 
And we defined a friend circle is a group of students who are direct or indirect friends.

Given a N*N matrix M representing the friend relationship between students in the class. 
If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. 
And you have to output the total number of friend circles among all the students.

https://leetcode.com/problems/friend-circles/
*/
public class FriendsGroup {

	int V = 0;
	boolean[] isVisited = new boolean [10] ;
	int disjointCount=0;
	public FriendsGroup(int v){
		this.V = v;
	}
	
	public void dfs(int[][] g , int u){
		
		isVisited[u]=true;
		for(int i =u;i<V;i++)
		{
			if (g[u][i] >0 && isVisited[i]!= true)
			{
				dfs(g,i);
			}
		}
		
	}
	
	public void findDisjointSets(int[][] graph){
		
		for(int i =0;i<V;i++)
			isVisited[i]=false;
		
		for(int i = 0;i<V;i++)
			{
				if (!isVisited[i])
				{
					disjointCount++;
					dfs(graph,i);
				}
					
			}
		System.out.println(disjointCount);
	}
	
	
	public static void main(String[] args){
	
		int[][] graph =  {{1,1,0},
				          {1,1,1},
				          {0,1,1}
				         };
		FriendsGroup obj = new FriendsGroup(3);
		obj.findDisjointSets(graph);
	}
}
