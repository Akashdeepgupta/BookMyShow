package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository extends JpaRepository<Auditorium,Integer> {
    public Auditorium findAuditoriumByName(String name);
}
