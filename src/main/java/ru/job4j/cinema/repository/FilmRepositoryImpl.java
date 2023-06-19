package ru.job4j.cinema.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.cinema.domain.Film;

import java.util.List;

@Repository
public class FilmRepositoryImpl implements FilmRepository{
    @Override
    public List<Film> findAll() {
        return null;
    }
}
