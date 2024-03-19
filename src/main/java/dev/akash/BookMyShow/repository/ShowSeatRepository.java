package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepository extends JpaRepository<ShowSeat,Integer> {
}
