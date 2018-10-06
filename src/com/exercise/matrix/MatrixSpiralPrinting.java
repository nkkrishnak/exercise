package com.exercise.matrix;

public class MatrixSpiralPrinting {

	public void printMatrix(Integer[][]m,int r , int c)
	{
		int rs = 0;
		int re = r-1;
		int cs = 0;
		int ce = c-1;
		
		while( rs <= re )
		{
			for (int i=cs; i<=ce;i++)
				System.out.println(m[rs][i]);
			rs++;
			
			for (int i=rs; i<=re;i++)
				System.out.println(m[i][ce]);
			ce--;
			
			for (int i=ce;i>=cs;i--)
				System.out.println(m[re][i]);
			re--;
			
			for (int i =re; i>=rs;i--)
				System.out.println(m[i][cs]);
			cs++;
		}
		
		
	}
	
	public static void main(String[] args)
	{
	
	Integer[] [] matrix = {
			{1 , 2, 3 , 4, 5},
			{6 , 7, 8 , 9,10},
			{11 ,12,13,14,15},
			{16 ,17,18,19,20},
			{21 ,22,23,24,25},
           	}; 
	MatrixSpiralPrinting obj = new MatrixSpiralPrinting();
	obj.printMatrix(matrix, 5, 5);
	}
}
