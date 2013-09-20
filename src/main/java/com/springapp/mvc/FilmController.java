package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import org.apache.log4j.Logger;

@Controller
@RequestMapping("/films")
public class FilmController {
    private Logger logger = Logger.getLogger(FilmController.class);

    @Autowired
    private FilmRepository filmRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String findByTitle(Film film, ModelMap model) {
        logger.info(film.getTitle());
        model.addAttribute("films", filmRepository.findFilms(film.getTitle()));
        return "films";
    }
}