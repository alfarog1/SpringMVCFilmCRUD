package com.skilldistillery.film.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		return "home";
	}
	
	@RequestMapping("add.do")
	public ModelAndView addFilm() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("film", new Film());
		mv.setViewName("add");
		return mv;
	}
	
	@RequestMapping("edit.do")
	public ModelAndView editFilm(int filmId) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("film", dao.findFilmById(filmId));
		mv.setViewName("edit");
		return mv;
	}
	
	

	@RequestMapping("findFilmId.do")
	public ModelAndView findFilmById(@RequestParam("filmId") int filmId) {
		ModelAndView mv = new ModelAndView();
		Film film = null;

		
		film = dao.findFilmById(filmId);

		mv.addObject("film", film);
		mv.setViewName("result");
		
		if (film != null) {
			mv.addObject("film", film);
		}
		else {
			mv.addObject("error", "Error encountered.  Your Film was not found");
		}
		
		mv.setViewName("result");

		return mv;
	}

	@RequestMapping(path = "createFilm.do", method=RequestMethod.POST)
	public ModelAndView createFilm(@ModelAttribute("film")Film film) {
		ModelAndView mv = new ModelAndView();
		Film returnedFilm;

		returnedFilm = dao.createFilm(film);

		if (film.getId() != 0) {
			mv.addObject("returnedFilm" + returnedFilm);

		} else {
			mv.addObject("error", "Error encountered.  Your Film was not added");
		}

		mv.setViewName("result");

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
		mv.setViewName("delete");
		
		return mv;
	}
	
	@RequestMapping(path = "updateFilm.do" , method=RequestMethod.POST)
	public ModelAndView updateFilm(@ModelAttribute("film")Film film) {
		ModelAndView mv = new ModelAndView();
		Film updatedFilm;
		
		
		if (film != null) {
			updatedFilm = dao.updateFilm(film);
//			dao.updateFilm(film);
			mv.addObject("filmUpdated", updatedFilm);
		}
		else {
			mv.addObject("error", "Error encountered.  Film not updated");
		}
		mv.setViewName("result");
		
		return mv;
	}
	
	@RequestMapping("searchFilm.do")
	public ModelAndView searchFilm(@RequestParam("searchTerm")String keyword) {
		ModelAndView mv = new ModelAndView();
		List<Integer> films = new ArrayList<>();
		
		films = dao.searchFilm(keyword);
		mv.addObject("searchResults", films);
		mv.setViewName("result");
		
		if (films != null) {
			List<Film> filmsFound = new ArrayList<>();
			for (Integer id : films) {
				filmsFound.add(dao.findFilmById(id));
			}
			if (filmsFound.size() == 0) {
				mv.setViewName("filmNotFound");
				return mv;
			}
			
			mv.addObject("searchResults", filmsFound);
		}
		else {
			mv.addObject("error", "Error encountered.  Your Film was not found");
		}
		
		mv.setViewName("result");
		
		return mv;
	}
	
	
	

}
