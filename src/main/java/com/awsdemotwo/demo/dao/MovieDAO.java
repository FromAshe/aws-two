package com.awsdemotwo.demo.dao;

import com.awsdemotwo.demo.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDAO {

    List<Movie> movieList;

    public MovieDAO(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public Movie addMovie(Movie movie){
        movieList.add(movie);
        return movie;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public Movie getMovie(int id){
        return movieList.get(id);
    }
}
