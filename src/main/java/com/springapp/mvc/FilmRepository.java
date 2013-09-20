package com.springapp.mvc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository {
    List<Film> findFilms(String title);
    List<Film> findAll();
}
