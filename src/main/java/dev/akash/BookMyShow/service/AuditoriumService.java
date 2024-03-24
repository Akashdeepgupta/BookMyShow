package dev.akash.BookMyShow.service;

import dev.akash.BookMyShow.model.Auditorium;
import dev.akash.BookMyShow.model.City;
import dev.akash.BookMyShow.model.Theatre;
import dev.akash.BookMyShow.model.constants.AuditoriumFeature;
import dev.akash.BookMyShow.repository.AuditoriumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditoriumService {
    @Autowired
    private AuditoriumRepository auditoriumRepository;
    @Autowired
    private CityService cityService;
    @Autowired
    private TheatreService theatreService;

    public Auditorium addAuditorium(int cityId, int theatreId, int capacity, String name, List<AuditoriumFeature> auditoriumFeatureList){
        // creating new theatre and adding its properties
        Auditorium auditorium = new Auditorium();
        auditorium.setCapacity(capacity);
        auditorium.setName(name);
        auditorium.setAuditoriumFeatures(auditoriumFeatureList);

        //add new auditorium to auditorium repo
        auditoriumRepository.save(auditorium);

        //get the theatre from corresponding city and add auditorium into it
        City city = cityService.getCityById(cityId);
        Theatre theatre = theatreService.getTheatreById(theatreId);

        List<Theatre> theatres = city.getTheatres();
        Theatre requiredTheatre = new Theatre();
        for(Theatre t : theatres){
            if(t.getId() == theatreId){
                requiredTheatre = t;
            }
        }

        List<Auditorium> auditoriumList = requiredTheatre.getAuditoriums();
        auditoriumList.add(auditorium);
        requiredTheatre.setAuditoriums(auditoriumList);

        theatreService.save(requiredTheatre);
        cityService.saveCity(city);
        return auditorium;
    }
}
