package io.datajek.spring.basics.movie_recommender_system.lesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
	}

}
