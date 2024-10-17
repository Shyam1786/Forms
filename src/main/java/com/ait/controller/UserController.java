package com.ait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ait.binding.User;

@Controller
public class UserController {
   
	@GetMapping("/")
	public String loadForm() {
		
		return "index";
	}
	
	@PostMapping("/user")
	public String handleSubmitBtn(User user,Model model) {
		System.out.println(user);
		model.addAttribute("msg", "User saved");
		return "index";
	}
}
