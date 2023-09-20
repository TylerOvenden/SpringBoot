package com.tyove.proj.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tyove.proj.service.UserService;
import com.tyove.proj.web.dto.UserRegisterationDto;

@Controller
@RequestMapping("/registration")
public class UserRegisterationController {
	private UserService us;
 
	public UserRegisterationController(UserService us) {
		super();
		this.us = us;
	}
	//UserRegisterationDto user is created here to be used in the form part of html
	@ModelAttribute("user")
	public UserRegisterationDto UserRegisterationDto() {
		
		return new UserRegisterationDto();
	}
	/*
	 * 
	 * this is equivalent to above
	 * @GetMapping
	public String showRegisterationForm(Model m) {
		m.addAttribute("user", new UserRegisterationDto());
		return "registeration";
		}
	 *  
	 *  
	 *  
	 *  */
	
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
