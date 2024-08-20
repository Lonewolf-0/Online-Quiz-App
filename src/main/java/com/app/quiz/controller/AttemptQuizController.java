package com.app.quiz.controller;

import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.quiz.model.AttemptQuiz;
import com.app.quiz.model.GKQuiz;
import com.app.quiz.model.ScienceQuiz;
import com.app.quiz.model.SportsQuiz;
import com.app.quiz.model.User;
import com.app.quiz.repository.AttemptQuizRepository;
import com.app.quiz.repository.GKQuizRepository;
import com.app.quiz.repository.ScienceQuizRepository;
import com.app.quiz.repository.SportsQuizRepository;
import com.app.quiz.repository.UserRepository;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AttemptQuizController {
	@Autowired
    private UserRepository userRepo;
	@Autowired
    private GKQuizRepository gkRepo;
	@Autowired
    private ScienceQuizRepository scienceRepo;
	@Autowired
    private SportsQuizRepository sportsRepo;
	@Autowired
	private AttemptQuizRepository attemptRepo;
	
	@GetMapping("/scores")
	public ModelAndView viewScoreboardPage(@AuthenticationPrincipal UserDetails currentUser) {
		String username = currentUser.getUsername();
		ModelAndView modelAndView = new ModelAndView("scoreboard");
		User currentUserDetails = (User) userRepo.findByUsername(username);
		String name = currentUserDetails.getName();
	    modelAndView.addObject("name", name);
		List<AttemptQuiz> attemptQuizContent = (List<AttemptQuiz>) attemptRepo.findByUsername(username);
	    modelAndView.addObject("attemptQuizContent", attemptQuizContent);
	    return modelAndView;
	}
	
	@PostMapping("/gkQuizSubmit")
	public ModelAndView gkResult(HttpServletRequest request, @AuthenticationPrincipal UserDetails currentUser) {
		String username = currentUser.getUsername();
		String category="";
		ModelAndView modelAndView = new ModelAndView("result");
		User currentUserDetails = (User) userRepo.findByUsername(username);
		String name = currentUserDetails.getName();
	    modelAndView.addObject("name", name);
	    
		List<GKQuiz> gkQuizContent = gkRepo.findAll();
		int i=1, marks=0;
		
		for (GKQuiz quiz : gkQuizContent) {
		    String selectedOption = request.getParameter("answer_" + i);
		    category = quiz.getCategory();
		    i++;
		    if((selectedOption!=null) && (selectedOption.equals(quiz.getAnswer()))) 
		    	marks++;
		}
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
		AttemptQuiz attempt = new AttemptQuiz(username, category, formattedDate, marks);	
	    attemptRepo.save(attempt);
		
	    modelAndView.addObject("currentQuizContent", attempt);
	    return modelAndView;
	}
	
	@PostMapping("/scienceQuizSubmit")
	public ModelAndView scienceResult(HttpServletRequest request, @AuthenticationPrincipal UserDetails currentUser) {
		String username = currentUser.getUsername();
		String category="";
		ModelAndView modelAndView = new ModelAndView("result");
		User currentUserDetails = (User) userRepo.findByUsername(username);
		String name = currentUserDetails.getName();
	    modelAndView.addObject("name", name);
		List<ScienceQuiz> scienceQuizContent = scienceRepo.findAll();
		int i=1, marks=0;
		
		for (ScienceQuiz quiz : scienceQuizContent) {
		    String selectedOption = request.getParameter("answer_" + i);
		    category = quiz.getCategory();
		    i++;
		    if(((selectedOption!=null) && selectedOption.equals(quiz.getAnswer()))) 
		    	marks++;
		}
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
		AttemptQuiz attempt = new AttemptQuiz(username, category, formattedDate, marks);	
	    attemptRepo.save(attempt);
		
	    modelAndView.addObject("currentQuizContent", attempt);
	    return modelAndView;
	}
	
	@PostMapping("/sportsQuizSubmit")
	public ModelAndView sportsResult(HttpServletRequest request, @AuthenticationPrincipal UserDetails currentUser) {
		String username = currentUser.getUsername();
		String category="";
		ModelAndView modelAndView = new ModelAndView("result");
		User currentUserDetails = (User) userRepo.findByUsername(username);
		String name = currentUserDetails.getName();
	    modelAndView.addObject("name", name);
		List<SportsQuiz> sportsQuizContent = sportsRepo.findAll();
		int i=1, marks=0;
		
		for (SportsQuiz quiz : sportsQuizContent) {
		    String selectedOption = request.getParameter("answer_" + i);
		    category = quiz.getCategory();
		    i++;
		    if(((selectedOption!=null) && selectedOption.equals(quiz.getAnswer()))) 
		    	marks++;
		}
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
		AttemptQuiz attempt = new AttemptQuiz(username, category, formattedDate, marks);	
	    attemptRepo.save(attempt);
		
	    modelAndView.addObject("currentQuizContent", attempt);
	    return modelAndView;
	}
}
