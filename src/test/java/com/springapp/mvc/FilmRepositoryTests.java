package com.springapp.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for the FilmController implementation.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:system-test-config.xml" })
public class FilmRepositoryTests {
	@Autowired
	private FilmRepository filmRepository;

	@Test
	public void testFindFilm() throws Exception {
        List<Film> films = filmRepository.findFilms(FilmTestConstants.FILM_TITLE);
        assertEquals(1, films.size());
		assertEquals(films.get(0).getTitle(), FilmTestConstants.FILM_TITLE);
	}

    @Test
    public void testFindFilmWithPartialTitle() throws Exception {
        List<Film> films = filmRepository.findFilms(FilmTestConstants.PARTIAL_FILM_TITLE);
        assertEquals(1, films.size());
        assertEquals(films.get(0).getTitle(), FilmTestConstants.FILM_TITLE);
    }

    @Test
    public void testFindFilmWithAmbiguousTitle() throws Exception {
        List<Film> films = filmRepository.findFilms(FilmTestConstants.AMBIGUOUS_FILM_TITLE);
        assertEquals(2, films.size());
        assertEquals(films.get(0).getTitle(), FilmTestConstants.FILM_TITLE2);
        assertEquals(films.get(1).getTitle(), FilmTestConstants.FILM_TITLE);
    }
}