package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat,Integer> {
    public Seat findSeatBySeatNumber(String seatNumber);
}
