package com.tyove.proj.service;

import com.tyove.proj.model.User;
import com.tyove.proj.web.dto.UserRegisterationDto;

public interface UserService {
	User save(UserRegisterationDto urd);
		
		
	
}
