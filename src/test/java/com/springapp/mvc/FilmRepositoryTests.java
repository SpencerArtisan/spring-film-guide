package com.springapp.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
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
		Film film = filmRepository.findFilm(FilmTestConstants.FILM_TITLE);
		assertNotNull("No such film " + FilmTestConstants.FILM_TITLE, film);
		assertEquals(film.getTitle(), FilmTestConstants.FILM_TITLE);
	}
}