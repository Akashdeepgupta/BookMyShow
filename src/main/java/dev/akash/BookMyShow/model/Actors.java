package dev.akash.BookMyShow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ACTOR")
public class Actors extends BaseModel{
    @Column(name = "ACTOR_NAME")
    private String name;
}
