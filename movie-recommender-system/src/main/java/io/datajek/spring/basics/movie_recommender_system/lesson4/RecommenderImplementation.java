package io.datajek.spring.basics.movie_recommender_system.lesson4;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation {
	@Autowired
	 private Filter filter;
	 
	 public RecommenderImplementation(Filter filter) {
		 super();
		 this.filter = filter;
	 }
	 
 public String[] recommendMovies(String movie) {
	System.out.println("the name of the filter is " + filter + "/n");
	String[] results = filter.getRecommendations("Finding Dory");
	return results;
 }
}
