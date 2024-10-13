package io.datajek.spring.basics.movie_recommender_system.lesson3;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
	public String[] getRecommendations(String movie) {
		// login
		return new String[] {"Finding Dory", "another ", "Sharks Tale"};
		//test
	}

}
