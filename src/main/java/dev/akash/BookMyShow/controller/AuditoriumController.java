package dev.akash.BookMyShow.controller;

import dev.akash.BookMyShow.dto.AuditoriumRequestDto;
import dev.akash.BookMyShow.service.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditoriumController {
    @Autowired
    private AuditoriumService auditoriumService;

    @PostMapping("/auditorium")
    public ResponseEntity addTheatre(@RequestBody AuditoriumRequestDto auditoriumRequestDto){
        return ResponseEntity.ok(auditoriumService.addAuditorium(auditoriumRequestDto.getCityId(),
                auditoriumRequestDto.getTheatreId(), auditoriumRequestDto.getCapacity(),auditoriumRequestDto.getName(),auditoriumRequestDto.getAuditoriumFeatureList()));
    }
}
