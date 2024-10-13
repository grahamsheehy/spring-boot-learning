package io.datajek.spring.basics.movie_recommender_system.lesson1;

public class ContentBasedFilter implements Filter {
	public String[] getRecomendations(String movie ) {
		//use content based filter to find similar movies
		// return the results
		
		return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
	}	

}
