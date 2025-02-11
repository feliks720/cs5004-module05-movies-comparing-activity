package movies;

import java.util.Comparator;

/**
 * This class implements the Comparator interface. It compares two movies by their directors.
 */
public class CompareMoviesByDirector implements Comparator<Movie> {

  @Override public int compare(Movie o1, Movie o2) {
    return o1.getDirector().compareTo(o2.getDirector());
  }

}
