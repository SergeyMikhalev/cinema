package ru.job4j.cinema.repository;

import ru.job4j.cinema.domain.Film;

import java.util.List;

public interface FilmRepository {
    List<Film> findAll();

}
