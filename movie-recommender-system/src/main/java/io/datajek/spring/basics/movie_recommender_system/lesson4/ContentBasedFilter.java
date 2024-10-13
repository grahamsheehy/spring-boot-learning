package io.datajek.spring.basics.movie_recommender_system.lesson4;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
	public String[] getRecommendations(String movie ) {
		//use content based filter to find similar movies
		// return the results
		
		return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
	}	

}
