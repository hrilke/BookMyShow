package dev.spring.BookMyShow.Model;

import dev.spring.BookMyShow.Model.Constant.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel{
    private double price;
    @ManyToOne
    private Seat seat;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;

    public ShowSeat(double price, Seat seat, Show show, ShowSeatStatus showSeatStatus) {
        this.price = price;
        this.seat = seat;
        this.show = show;
        this.showSeatStatus = showSeatStatus;
    }

    public ShowSeat() {
    }
}
