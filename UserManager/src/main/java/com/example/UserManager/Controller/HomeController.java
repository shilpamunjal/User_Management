package com.example.UserManager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.UserManager.Model.UserDetails;
import com.example.UserManager.Service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userservice;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute UserDetails user) {
		System.out.println("printing user"+user.getEmail());
	boolean f=userservice.checkEmail(user.getEmail());
	if(f) {
		System.out.println("User already exists");
	}
	else
	{
		UserDetails users=userservice.createUser(user);
		if(users!=null) {
			System.out.println("registered");
		}
		else {
			System.out.println("error");
		}}
		return "redirect:/register";
	}

}
