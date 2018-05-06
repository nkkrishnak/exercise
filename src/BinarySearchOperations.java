import java.util.Arrays;

import exercise.src.Node;


public class BinarySearchOperations {
	private int [] firstarray = null;
	private int [] secondarray = null;
	private int caDistance = 0;
	
	private void findCA(Node n , int [] arr, int a , int b,int arrlen)
	{
		if (n == null)
			return;
		if ( n.value == a )
			{ 
			   arr[arrlen]=-3;
			   firstarray = arr.clone();
			}
		else if ( n.value == b)
			{ 
			 arr[arrlen]=-3;
			 secondarray = arr.clone();
			}
		arr[arrlen] = n.value;
		arrlen++;
		
		findCA(n.left,arr,a,b,arrlen);
		findCA(n.right,arr,a,b,arrlen);
	}
	
	//#http://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/
	public void findCommonAncestor(Node n,int a ,int b)
	{
		int [] arr = new int [10] ;
		int i = 0;
		findCA(n,arr,a,b,0);
		System.out.println(Arrays.toString(firstarray));
		System.out.println(Arrays.toString(secondarray));
		for ( i = 0 ; firstarray[i] == secondarray[i] && firstarray[i] > 0; i++);
		System.out.println(firstarray[i-1]);
	}
	
	public void  findDistance(Node n,int k,int len)
	{
		if (n== null)
		 return;
		
		if ( n.value == k )
			caDistance = len;
		
		findDistance(n.left,  k , len);
		findDistance(n.right, k, len);
	}
	public void findDistanceBetweenTwoNodes(Node n , int a , int b )
	{
		int [] arr = new int [10] ;
		int lenA =0, lenB=0;
		int i = 0;
		findCA(n,arr,a,b,0);
		System.out.println(Arrays.toString(firstarray));
		System.out.println(Arrays.toString(secondarray));
		for ( i = 0 ; firstarray[i] == secondarray[i] && firstarray[i] > 0; i++);
		for(int j = 0;firstarray[j] != -3 ;j++)
		lenA = j;
		for(int j = 0;secondarray[j] != -3 ;j++)
		lenB = j;
		findDistance(n, firstarray[i-1],0);
		int td = lenA + lenB - 2 *(caDistance);
		System.out.println(td);
	}
	
	public static void main(String[] args )
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
		BinarySearchOperations obj = new BinarySearchOperations();
		obj.findCommonAncestor(root,2,1);
		
		// 
		//obj.findDistanceBetweenTwoNodes(root, 1, 7);
	}
}