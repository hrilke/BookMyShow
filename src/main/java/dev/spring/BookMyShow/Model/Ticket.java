package dev.spring.BookMyShow.Model;

import dev.spring.BookMyShow.Model.Constant.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private Instant timeOfBooking;
    @OneToMany
    private List<ShowSeat> showSeatList;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

}
