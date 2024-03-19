package dev.akash.BookMyShow.service;

import dev.akash.BookMyShow.model.ShowSeat;
import dev.akash.BookMyShow.repository.ShowSeatRepository;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatService {
    private ShowSeatRepository showSeatRepository;

    public ShowSeat getShowSeat(int showSeatId){
        return showSeatRepository.findById(showSeatId).get();
    }

    public ShowSeat saveShowSeat(ShowSeat showSeat){
        return showSeatRepository.save(showSeat);
    }
}
