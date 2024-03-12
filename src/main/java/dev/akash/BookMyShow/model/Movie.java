package dev.akash.BookMyShow.model;

import dev.akash.BookMyShow.model.constants.MovieFeature;
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
    @ManyToMany
    private List<Actor> actors;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;
    //TODO : add more attributes like release_date,language,runtime,genre etc

}
