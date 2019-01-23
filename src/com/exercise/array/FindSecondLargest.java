package com.exercise.array;


public class FindSecondLargest {
	
	int students = 4;
	int subjects = 3;
	
	private  void findSecondTopper(int[][] markSheet) {
		
		
		
		for(int i = 0 ; i < subjects ; i++)
		{
			int max = -1;
			int secondMax = -1;
			
			for(int j =0 ; j < students ; j++)
			{

				if(markSheet[j][i] > max){
					
					secondMax = max;
					max = markSheet[j][i];
				}
				else	if (markSheet[j][i] < max && markSheet[j][i] > secondMax)
 				{
					secondMax= markSheet[j][i];
				}

			}

			System.out.println("Second top mark for subject :" + secondMax);
		}
	}
	
	
	public static void main ( String[] args )
	{
		int [][] markSheet = {
				{100 , 99, 98},
				{99 , 100, 100},
				{100 , 98, 100},
				{100 , 100, 97}
		};
		
		FindSecondLargest obj = new FindSecondLargest();
		obj.findSecondTopper(markSheet);
	}



}
