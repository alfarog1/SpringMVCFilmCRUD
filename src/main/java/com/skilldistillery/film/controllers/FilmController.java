package com.skilldistillery.film.controllers;

import java.util.ArrayList;
import java.util.List;

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
	public ModelAndView findFilmById(@RequestParam("filmId") int filmId) {
		ModelAndView mv = new ModelAndView();
		Film film = null;

		
		film = dao.findFilmById(filmId);
		
		if (film != null) {
			mv.addObject("film", film);
		}
		else {
			mv.addObject("error", "Error encountered.  Your Film" + film + " was not found");
		}
		
		mv.setViewName("result.jsp");

		return mv;
	}

	@RequestMapping("createFilm.do")
	public ModelAndView createFilm(@RequestParam("film")Film film) {
		ModelAndView mv = new ModelAndView();
		Film returnedFilm;

		returnedFilm = dao.createFilm(film);

		if (film != null) {
			mv.addObject("returnedFilm" + returnedFilm);

		} else {
			mv.addObject("error", "Error encountered.  Your Film" + returnedFilm + " was not added");
		}

		mv.setViewName("result.jsp");

		return mv;
	}

	@RequestMapping("deleteFilm.do")
	public ModelAndView deleteFilm(@RequestParam("filmId")int id) {
		ModelAndView mv = new ModelAndView();
		boolean filmDeleted;
		
		Film toBeDeleted = dao.findFilmById(id);
		
		
		if (toBeDeleted != null) {
			filmDeleted = dao.deleteFilm(toBeDeleted);
			mv.addObject("filmDeleted", "Your film id: " + id + " was deleted" );
		}
		else {
			mv.addObject("error", "Error encountered.  Film not deleted");
		}
		mv.setViewName("result.jsp");
		
		return mv;
	}
	
	@RequestMapping("updateFilm.do")
	public ModelAndView updateFilm(@RequestParam("film")Film film) {
		ModelAndView mv = new ModelAndView();
		Film updatedFilm;
		
		
		if (film != null) {
			updatedFilm = dao.updateFilm(film);
			mv.addObject("filmUpdated", updatedFilm);
		}
		else {
			mv.addObject("error", "Error encountered.  Film not updated");
		}
		mv.setViewName("result.jsp");
		
		return mv;
	}
	
	@RequestMapping("searchFilm.do")
	public ModelAndView searchFilm(@RequestParam("searchTerm")String keyword) {
		ModelAndView mv = new ModelAndView();
		List<Integer> films = new ArrayList<>();
		
		films = dao.searchFilm(keyword);
		
		if (films != null) {
			mv.addObject("searchResults", films);
		}
		else {
			mv.addObject("error", "Error encountered.  Your Film" + films + " was not found");
		}
		
		mv.setViewName("result.jsp");
		
		return mv;
	}
	
	
	

}
