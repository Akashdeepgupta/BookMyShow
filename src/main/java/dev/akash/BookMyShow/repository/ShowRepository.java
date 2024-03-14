package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show,Integer> {
}
