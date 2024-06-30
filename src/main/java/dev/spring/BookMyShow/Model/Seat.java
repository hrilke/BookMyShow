package dev.spring.BookMyShow.Model;

import dev.spring.BookMyShow.Model.Constant.SeatStatus;
import dev.spring.BookMyShow.Model.Constant.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

    public Seat() {
    }
}
