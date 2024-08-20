package com.app.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.quiz.model.ScienceQuiz;
import com.app.quiz.model.User;
import com.app.quiz.repository.ScienceQuizRepository;
import com.app.quiz.repository.UserRepository;

@Controller
public class ScienceQuizController {
	@Autowired
    private UserRepository userRepo;
	
	@Autowired
    private ScienceQuizRepository scienceRepo;
	
	@GetMapping("/scienceQuiz")
	public ModelAndView getScienceData(@AuthenticationPrincipal UserDetails currentUser) {
		String username = currentUser.getUsername();
	    ModelAndView modelAndView = new ModelAndView("science-quiz");
		User currentUserDetails = (User) userRepo.findByUsername(username);
		String name = currentUserDetails.getName();
	    modelAndView.addObject("name", name);
	    List<ScienceQuiz> scienceQuizContent = scienceRepo.findAll();
	    modelAndView.addObject("scienceQuizContent", scienceQuizContent);
	    return modelAndView;
	}
}
