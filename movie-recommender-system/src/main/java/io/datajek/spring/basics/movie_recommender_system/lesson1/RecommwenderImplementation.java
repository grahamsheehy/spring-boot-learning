package io.datajek.spring.basics.movie_recommender_system.lesson1;

public class RecommwenderImplementation {
public String[] recommendMovies (String movie ) {
	//use content based filter to find similar movies
	// return the results
	ContentBasedFilter filter = new ContentBasedFilter();
	String[] results = filter.getRecomendations(movie);
	
	return results;
}
}
