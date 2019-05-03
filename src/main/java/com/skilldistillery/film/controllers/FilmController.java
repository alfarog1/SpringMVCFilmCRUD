package com.skilldistillery.film.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.film.dao.DAOImpl;
import com.skilldistillery.film.entities.Film;

@Controller
public class FilmController {

	@Autowired
	private DAOImpl dao;
	
	@RequestMapping("home.do")
	public String index() {
		return "home.jsp";
	}
	
	@RequestMapping("findFilmId.do")
	public ModelAndView findFilmById(@RequestParam("getFilm")int filmId) {
		ModelAndView mv = new ModelAndView();
		Film film = null;
		
		film = dao.findFilmById(filmId);
		
		mv.addObject("film", film);
		mv.setViewName("result.jsp");
		
		return mv;	
	}
	
	public ModelAndView createFilm(Film film) {
		ModelAndView mv = new ModelAndView();
		Film returnedFilm;
		
		returnedFilm = dao.createFilm(film);
		
		if (film != null) {
		mv.addObject("returnedFilm" + returnedFilm);
		
		}
		else {
			mv.addObject("Error", "Error encountered.  Film not added");
		}
		
		mv.setViewName("result.jsp");
		
		return mv;
	}
	
	
	
	
}

