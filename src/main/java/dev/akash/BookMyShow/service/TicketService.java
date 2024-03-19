package dev.akash.BookMyShow.service;

import dev.akash.BookMyShow.exception.SeatNotAvailableException;
import dev.akash.BookMyShow.model.ShowSeat;
import dev.akash.BookMyShow.model.Ticket;
import dev.akash.BookMyShow.model.constants.ShowSeatStatus;
import dev.akash.BookMyShow.repository.TicketRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketService {
    private TicketRepository ticketRepository;
    private ShowSeatService showSeatService;

    public Ticket bookTicket(List<Integer> showSeatIds, int UserId){
        checkAndLockSeats(showSeatIds);
        startPayment(showSeatIds);
        Ticket ticket = new Ticket();
        ticketRepository.save(ticket);
        return ticket;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void checkAndLockSeats(List<Integer> showSeatIds){

        //checking if the seat is available
        for(int showSeatId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            if(!seat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new SeatNotAvailableException("The seat is not available anymore");
            }
        }

        //updating the seat to locked status
        for(int showSeatId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            showSeatService.saveShowSeat(seat);
        }

    }

    public boolean startPayment(List<Integer> showSeatIds){
        return true;
    }
    public String greet(){
        return "Hello World";
    }
}
