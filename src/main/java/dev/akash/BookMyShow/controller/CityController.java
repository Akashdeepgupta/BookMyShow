package dev.akash.BookMyShow.controller;

import dev.akash.BookMyShow.dto.CityRequestDto;
import dev.akash.BookMyShow.model.City;
import dev.akash.BookMyShow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    public ResponseEntity getAllCity(){
        return ResponseEntity.ok(cityService.getAllCity());
    }

//    @GetMapping("/city/{id}")
//    public ResponseEntity getCityByID(@PathVariable("id") int cityId){
//        return ResponseEntity.ok(cityService.getCityById(cityId));
//    }

    @PostMapping("/city")
    public ResponseEntity addCity(@RequestBody CityRequestDto cityRequestDto){
        //major work done by controller is validation
        try{
            String cityName = cityRequestDto.getName();
            if(cityName == null || cityName.length() == 0 || cityName.isEmpty() || cityName.isBlank()){
//                throw new InvalidCityNameException
            }
            City savedCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(savedCity);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable("id") int cityId){
        boolean isDeleted = cityService.deleteCityById(cityId);
        return ResponseEntity.ok(isDeleted);
    }

    @GetMapping("/city/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String cityName){
        return ResponseEntity.ok(cityService.getCityByName(cityName));
    }

}

/*
     "        " -> blank string
     ""  -> empty string
* */
