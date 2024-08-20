package com.app.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.quiz.model.SportsQuiz;
import com.app.quiz.model.User;
import com.app.quiz.repository.SportsQuizRepository;
import com.app.quiz.repository.UserRepository;

@Controller
public class SportsQuizController {
	@Autowired
    private UserRepository userRepo;
	
	@Autowired
    private SportsQuizRepository sportsRepo;
	
	@GetMapping("/sportsQuiz")
	public ModelAndView getScienceData(@AuthenticationPrincipal UserDetails currentUser) {
		String username = currentUser.getUsername();
	    ModelAndView modelAndView = new ModelAndView("sports-quiz");
	    User currentUserDetails = (User) userRepo.findByUsername(username);
		String name = currentUserDetails.getName();
	    modelAndView.addObject("name", name);
	    List<SportsQuiz> sportsQuizContent = sportsRepo.findAll();
	    modelAndView.addObject("sportsQuizContent", sportsQuizContent);
	    return modelAndView;
	}
}
