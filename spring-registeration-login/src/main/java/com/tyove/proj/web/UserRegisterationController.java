package com.tyove.proj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tyove.proj.service.UserService;
import com.tyove.proj.web.dto.UserRegisterationDto;

@Controller
@RequestMapping("\registeration")
public class UserRegisterationController {
	private UserService us;

	public UserRegisterationController(UserService us) {
		super();
		this.us = us;
	}
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegisterationDto urd) {
		us.save(urd);
		return "s";
	}
	@GetMapping
	public String showRegisterationForm() {
		
		return "registeration";
		}

}
