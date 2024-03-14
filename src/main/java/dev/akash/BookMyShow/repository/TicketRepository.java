package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
