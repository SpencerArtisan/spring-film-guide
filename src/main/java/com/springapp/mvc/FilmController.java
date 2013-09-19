package com.springapp.mvc;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
        Film film = new Film();
        film.setTitle(title);
        film.setRating(3.5f);
        model.addAttribute("film", film);
        return "film";
    }
}