package com.awsdemotwo.demo.controller;

import com.awsdemotwo.demo.model.Movie;
import com.awsdemotwo.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("")
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable int id){
        return movieService.getMovieById(id);
    }

    @GetMapping("")
    public List<Movie> getMovies(){
        return movieService.getMovies();
    }
}
