package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
}
