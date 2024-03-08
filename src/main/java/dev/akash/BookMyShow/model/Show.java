package dev.akash.BookMyShow.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.List;

public class Show extends BaseModel {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
     private Movie movie;
    @ManyToOne
     private Auditorium auditorium;
     private List<ShowSeat> showSeats;
}
