import java.util.Comparator;


public class MovieBudgetCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.budget - o2.budget;
	}

}
