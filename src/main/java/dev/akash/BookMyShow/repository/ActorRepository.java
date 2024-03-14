package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Integer> {
}
