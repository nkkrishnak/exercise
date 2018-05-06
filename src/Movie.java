import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Movie{

	String name ;
	Integer rating;
	Integer budget;
	
	
	public static void main(String[] args)
	{
		Movie m1 = new Movie();
		m1.rating = 10;
		m1.budget = 1;
		Movie m2 = new Movie();
		m2.rating = 6;
		m2.budget = 100;
		Movie m3 = new Movie();
		m3.rating = 9;
		m3.budget = 3;
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		Collections.sort(movieList,new MovieRatingCompare());
		Iterator<Movie> itr = movieList.iterator();
		while(itr.hasNext())
		{
			Movie mov =itr.next();
			System.out.println(mov.budget);
		}
		System.out.println("budget compare");
		Collections.sort(movieList,new MovieBudgetCompare());
		Iterator<Movie> itr1 = movieList.iterator();
		while(itr1.hasNext())
		{
			Movie mov =itr1.next();
			System.out.println(mov.budget);
		}
		
	}
}
