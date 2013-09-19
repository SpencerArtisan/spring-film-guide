package com.springapp.mvc;

import java.util.List;

public class JpaFilmRepository implements FilmRepository {
    @Override
    public Film findFilm(String title) {
        return new Film();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Film> findAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
