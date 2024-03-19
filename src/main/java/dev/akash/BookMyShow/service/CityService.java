package dev.akash.BookMyShow.service;

import dev.akash.BookMyShow.exception.CityNotFoundException;
import dev.akash.BookMyShow.model.City;
import dev.akash.BookMyShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    public City saveCity(String cityName){
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }

    public City saveCity(City city){
        return cityRepository.save(city);
    }

    public List<City> getAllCity(){
        return cityRepository.findAll();
    }

    public boolean deleteCityById(int cityId){
        cityRepository.deleteById(cityId);
        return true;
    }
    public City getCityById(int cityId){
        return cityRepository.findById(cityId).get();
//        return cityRepository.findById(cityId).orElseThrow(() -> new CityNotFoundException("there is no city with id"+ cityId));
    }

    public City getCityByName(String cityName){
        return cityRepository.findCityByName(cityName);
    }
}
