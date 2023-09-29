package com.tyove.proj.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tyove.proj.model.User;
import com.tyove.proj.web.dto.UserRegisterationDto;

public interface UserService {
	User save(UserRegisterationDto urd);
		
	 User findUserByEmail(String email);

	UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;

	   
	
}
