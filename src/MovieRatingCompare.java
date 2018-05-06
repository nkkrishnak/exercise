import java.util.Comparator;


public class MovieRatingCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.rating - o2.rating;
	}

	
}
