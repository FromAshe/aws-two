package com.awsdemotwo.demo.service;

import com.awsdemotwo.demo.dao.MovieDAO;
import com.awsdemotwo.demo.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieDAO movieDAO;

    public List<Movie> getMovies(){
        return movieDAO.getMovieList();
    }

    public Movie getMovieById(int id){
        return movieDAO.getMovie(id);
    }

    public Movie addMovie(Movie movie){
        return movieDAO.addMovie(movie);
    }
}
