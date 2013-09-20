package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmRepository filmRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String listFilms(ModelMap model) {
        model.addAttribute("film", new Film());
        model.addAttribute("films", filmRepository.findAll().subList(300000, 310000));
        return "films";
    }

    @RequestMapping(value = "/{title}", method = RequestMethod.GET)
    public String showFilm(@PathVariable String title, ModelMap model) {
        model.addAttribute("film", filmRepository.findFilms(title));
        return "film";
    }
}