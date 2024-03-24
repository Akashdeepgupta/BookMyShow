package dev.akash.BookMyShow.model;

import dev.akash.BookMyShow.model.constants.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Show_Seat_BMS")
public class ShowSeat extends BaseModel{
    private int price;
    @ManyToOne
    private Seat seat;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;

    public ShowSeat(int price, Show show,Seat seat, ShowSeatStatus showSeatStatus) {
        this.price = price;
        this.seat = seat;
        this.show = show;
        this.showSeatStatus = showSeatStatus;
    }
}
