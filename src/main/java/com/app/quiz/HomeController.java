package com.app.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.quiz.model.AttemptQuiz;
import com.app.quiz.model.User;
import com.app.quiz.repository.GKQuizRepository;
import com.app.quiz.repository.UserRepository;

@Controller
public class HomeController {
	@Autowired
    private UserRepository userRepo;
	
	@GetMapping("/home")
    public ModelAndView home(@AuthenticationPrincipal UserDetails currentUser) {
		String username = currentUser.getUsername();
		ModelAndView modelAndView = new ModelAndView("home");
		User currentUserDetails = (User) userRepo.findByUsername(username);
		String name = currentUserDetails.getName();
	    modelAndView.addObject("name", name);
	    return modelAndView;
    }
	
	@GetMapping("/login")
	public String loginPage() {
		return "user-login";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "user-register";
	}
}
