package com.app.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.quiz.model.User;
import com.app.quiz.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
    private UserRepository userRepo;
	
	@PostMapping("/register-process")
	public String processRegister(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("username") String username, @RequestParam("password") String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encodedPassword = passwordEncoder.encode(password);
	    User user = new User(name, email, username, encodedPassword);
	    userRepo.save(user);
	    
	    return "redirect:/login";
	}
}
