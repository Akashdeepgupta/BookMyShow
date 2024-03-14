package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
