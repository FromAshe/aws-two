package com.awsdemotwo.demo.dao;

import com.awsdemotwo.demo.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDAO {

    Map<Movie> movieMap;

    public MovieDAO( Map<Movie> movieMap) {
        this.movieMap = movieMap;
    }

    public Movie addMovie(Movie movie){
        movieMap.put(movie);
        return movie;
    }

    public Map<Movie< getMovieList() {
        return movieMap;
    }

    public Movie getMovie(int id){
        return movieMap.get(id);
    }
}
