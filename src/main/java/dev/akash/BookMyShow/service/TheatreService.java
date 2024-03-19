package dev.akash.BookMyShow.service;

import dev.akash.BookMyShow.model.City;
import dev.akash.BookMyShow.model.Theatre;
import dev.akash.BookMyShow.repository.TheatreRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
@Service
public class TheatreService {
    @Autowired
    TheatreRepository theatreRepository;
    @Autowired
    CityService cityService;

    public Theatre getTheatre(){
        return null;
    }

    public Theatre addTheatre(String theatreName,String theatreAddress,int cityId){
        //created and added new theatre
        Theatre theatre = new Theatre();
        theatre.setName(theatreName);
        theatre.setAddress(theatreAddress);
        theatreRepository.save(theatre);
        //add the theatre to the corresponding city
        City city =  cityService.getCityById(cityId);
        List<Theatre> theatreList = city.getTheatres();
        theatreList.add(theatre);
        city.setTheatres(theatreList);
        cityService.saveCity(city);
        return theatre;
    }
}
