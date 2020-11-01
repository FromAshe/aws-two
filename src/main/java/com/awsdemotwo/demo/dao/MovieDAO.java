package com.awsdemotwo.demo.dao;

import com.awsdemotwo.demo.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MovieDAO {


    Map<Integer, Movie> movieMap;

    public MovieDAO() {
        this.movieMap = new HashMap<>();
    }

    public Movie addMovie(Movie movie){
        movieMap.put((int)Math.random(), movie);
        return movie;
    }

    public Map<Integer,Movie> getMovieList() {
        return movieMap;
    }

    public Movie getMovie(int id){
        return movieMap.get(id);
    }
}
