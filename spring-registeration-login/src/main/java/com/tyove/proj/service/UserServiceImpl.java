package com.tyove.proj.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyove.proj.model.Role;
import com.tyove.proj.model.User;
import com.tyove.proj.repository.UserRepository;
import com.tyove.proj.web.dto.UserRegisterationDto;

@Service
public class UserServiceImpl implements UserService {


	private UserRepository ur; 
	

	public UserServiceImpl(UserRepository ur) {
		super();
		this.ur = ur;
	}


	@Override	
	public User save(UserRegisterationDto urd) {
		// TODO Auto-generated method stub
		User user = new User(urd.getFirstName(), urd.getLastName(),urd.getEmail(), urd.getPassword(),
				 Arrays.asList(new Role("ROLE_USER")));
		return ur.save(user);
	}

}
