package io.datajek.spring.basics.movie_recommender_system.lesson4;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class CollaborativeFilter implements Filter {
	public String[] getRecommendations(String movie) {
		// login
		return new String[] {"Finding Dory", "another ", "Sharks Tale"};
		//test
	}

}
