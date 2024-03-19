package dev.akash.BookMyShow.repository;

import dev.akash.BookMyShow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Integer> {
    City findCityByName(String name);
}
