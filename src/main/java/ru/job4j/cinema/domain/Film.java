package ru.job4j.cinema.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder(builderMethodName = "of")
public class Film {

    @EqualsAndHashCode.Include
    private int id;
    private String name;
    private String description;

    private int releaseYear;

    private int minimalAge;

    private int durationInMinutes;
}
