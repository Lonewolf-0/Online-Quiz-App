package com.app.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.quiz.model.GKQuiz;
import com.app.quiz.model.User;
import com.app.quiz.repository.GKQuizRepository;
import com.app.quiz.repository.UserRepository;


@Controller
public class GKQuizController {
	@Autowired
    private UserRepository userRepo;
	
	@Autowired
    private GKQuizRepository gkRepo;
	
	@GetMapping("/gkQuiz")
	public ModelAndView getGKData(@AuthenticationPrincipal UserDetails currentUser) {
		String username = currentUser.getUsername();
		ModelAndView modelAndView = new ModelAndView("gk-quiz");
		User currentUserDetails = (User) userRepo.findByUsername(username);
		String name = currentUserDetails.getName();
	    modelAndView.addObject("name", name);
	    List<GKQuiz> gkQuizContent = gkRepo.findAll();
	    modelAndView.addObject("gkQuizContent", gkQuizContent);
	    return modelAndView;
	}

}
