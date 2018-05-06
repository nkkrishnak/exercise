
public class MatrixManipulations {
 
	//print matrix  in spiral order 
	public void printSpiralMatrix(int [] [] m)
	{
		int sr = 0 , er = 3  ,  sc = 0  ,  ec = 3;
		
		while ((sr <= er) && (sc <= ec))
 		{
			//print left to right horizontal
			for ( int i=sc ; i <= ec; i++ )
				System.out.println(m[sr][i]);
			sr++;
			if (sr <= er)
			{ 
				for( int i = sr ; i <= er ; i ++)
					System.out.println(m[i][ec]);
				ec--;
			}
			
			for(int  i = ec ; i >= sc; i--)
				System.out.println(m[er][i]);
			er--;
			
			if (er >= sr)
			{
				for(int  i = er ; i >= sr; i--)
					System.out.println(m[i][sc]);
				sc++;
			}	
				
		}
	}
	public static void main(String[] args)
	{
		int [] []matrix =  {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		MatrixManipulations manip = new MatrixManipulations();
		manip.printSpiralMatrix(matrix);
		
		
	}
}
