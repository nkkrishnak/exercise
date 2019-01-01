/*
You are given an array A1,A2...AN. You have to tell how many pairs (i, j)exist such that 1 ≤ i < j ≤ N and Ai XOR Aj is odd.
Input and Output 
First line T, the number of testcases. Each testcase: first line N, followed by N integers in next line. For each testcase, print the required answer in one line.
Constraints 
1 ≤ T ≤ 10 
1 ≤ N ≤ 105 
0 ≤ Ai ≤ 109
	
SAMPLE INPUT
 
2
3
1 2 3
4
1 2 3 4
SAMPLE OUTPUT
 
2
4
Explanation
For first testcase: 1 XOR 2 is 3 and 2 XOR 3 is 1. So, 2 valid pairs. For second testcase: 1 XOR 2 is 3 and 2 XOR 3 is 1 and 1 XOR 4 is 5 and 3 XOR 4 is 7. So, 4 valid pairs.

*/
package com.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ArrayCounter {

	 public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = br.readLine();                // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        //Scanner
	        Scanner s = new Scanner(System.in);
	        String name = s.nextLine();                 // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        */

	        // Write your code here
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        Integer Tcases = Integer.parseInt(br.readLine());
	        int result;
	        while (Tcases >= 1)
	        {
	        	 Integer ArrSize = Integer.parseInt(br.readLine());
	        	 Integer [] arr = new Integer[ArrSize];
	        	 result = 0;
	        	 int i=0;
	        	 while (i<ArrSize)
	        	 {
	        		StringTokenizer tk = new StringTokenizer(br.readLine());
	        		arr[i]= Integer.parseInt(tk.nextToken());
	        		i++;
	        		
	        	 }
	        	for ( int j = 0 ; j < arr.length;j++)
	        	{
	        		for ( int k = j+1 ; k < arr.length ; k++)
	        		{
//	        			System.out.println((arr[j] ^ arr[k]));
	        			if ( (arr[j] ^ arr[k]) %2 != 0 )
	        			{
	        				System.out.println("("+j+","+k+")");
	        				result++;
	        			}
	        				
	        			
	        		}
	        	}
	         Tcases++;
	         System.out.println(result);
	        }
	        
	        
	        
	    }
}
