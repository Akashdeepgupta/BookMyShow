package dev.akash.BookMyShow.model;

import dev.akash.BookMyShow.model.constants.SeatStatus;
import dev.akash.BookMyShow.model.constants.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int row;
    private int col;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;

    public Seat(int row, int col, String seatNumber, SeatType seatType, SeatStatus seatStatus) {
        this.row = row;
        this.col = col;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
    }
}
