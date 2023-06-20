package com.example.login.controller;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.login.domain.Login; 


@Controller
public class LoginController {
	
	@GetMapping("/")
	 public String index() {
		 return "index";
		 
	 }
	@GetMapping("/index")
	 public String indice() {
		 return "index";
		 
	 }
	
	@GetMapping("/welcome")
	 public String welcome() {
		 return "welcome";
		 
	 }
	
	@GetMapping("/login")
	 public String login(Model model) {
		 //model.addAttribute("login", new  Login	());
		 return "login";
		 
	 }
	/*
	@PostMapping("/login")
	public String loginSubmit(@ModelAttribute("login") Login login){
		
		// Este post-mapping nunca se ejecuta queda como muestra 
		// de un login basico sin usar la seguridad
		System.out.println("usuario: "+login.getUser());
		System.out.println("password: "+login.getPassword());
		
		if (login.getUser().equals("perico") && login.getPassword().equals("palotes")){
			return "welcome";
		}else {
			return "login";
		}
		
	}
	*/
	
}
