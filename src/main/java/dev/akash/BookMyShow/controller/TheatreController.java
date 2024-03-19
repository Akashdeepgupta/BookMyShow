package dev.akash.BookMyShow.controller;

import dev.akash.BookMyShow.dto.TheatreRequestDto;
import dev.akash.BookMyShow.model.Theatre;
import dev.akash.BookMyShow.service.CityService;
import dev.akash.BookMyShow.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheatreController {
    @Autowired
    TheatreService theatreService;
    @PostMapping("/theatre")
    public Theatre addTheatre(@RequestBody TheatreRequestDto theatreRequestDto){
        return theatreService.addTheatre(theatreRequestDto.getName(),theatreRequestDto.getAddress(),theatreRequestDto.getCityId());
    }
}
