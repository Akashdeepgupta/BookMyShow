package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
    public Movie findMovieByName(String name);
}
