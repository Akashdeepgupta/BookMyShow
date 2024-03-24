package dev.akash.BookMyShow.dto;

import dev.akash.BookMyShow.model.constants.AuditoriumFeature;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class AuditoriumRequestDto {
    private String name;
    private int capacity;
    private int cityId;
    private int theatreId;
    private List<AuditoriumFeature> auditoriumFeatureList;

}
