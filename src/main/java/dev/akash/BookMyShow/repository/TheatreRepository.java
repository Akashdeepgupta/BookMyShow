package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre,Integer> {
    public Theatre findTheatreByName(String name);
}
