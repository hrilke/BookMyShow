package dev.spring.BookMyShow.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Entity(name = "FilmShow")
public class Show extends BaseModel{
    private Instant startTime;
    private Instant endTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Auditorium auditorium;
    @OneToMany
    private List<ShowSeat> showSeatList;

}
