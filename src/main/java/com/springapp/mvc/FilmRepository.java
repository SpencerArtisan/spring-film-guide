package com.springapp.mvc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository {
    Film findFilm(String title);
    List<Film> findAll();
}
