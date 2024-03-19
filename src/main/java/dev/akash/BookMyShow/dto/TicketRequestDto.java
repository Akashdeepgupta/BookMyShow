package dev.akash.BookMyShow.dto;

import dev.akash.BookMyShow.model.ShowSeat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TicketRequestDto {
    private List<Integer> showSeats;
    private Integer UserId;
}
