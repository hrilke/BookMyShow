package dev.spring.BookMyShow.Model;

import dev.spring.BookMyShow.Model.Constant.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel {
    private String name;
    private int capacity;

    @ManyToMany
    private List<Show> showList;

    @OneToMany
    private List<Seat> seatList;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> FeatureList;

    public Auditorium(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Auditorium() {
    }
}
