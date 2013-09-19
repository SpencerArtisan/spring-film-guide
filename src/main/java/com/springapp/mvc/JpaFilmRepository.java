package com.springapp.mvc;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("filmRepository")
public class JpaFilmRepository implements FilmRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public Film findFilm(String title) {
        try {
            String query = "select f from Film f where title = :title";

            return (Film) entityManager.createQuery(query).setParameter("title", title).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Film> findAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
