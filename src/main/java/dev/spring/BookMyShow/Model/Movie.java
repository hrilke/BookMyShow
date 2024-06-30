package dev.spring.BookMyShow.Model;

import dev.spring.BookMyShow.Model.Constant.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    private String description;
    private Double imdbRating;

    @ManyToMany
    private List<Actor>actorList;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Feature> featureList;

    public Movie(String name, String description, Double imdbRating) {
        this.name = name;
        this.description = description;
        this.imdbRating = imdbRating;
    }

    public Movie() {
    }
}
