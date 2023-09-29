package com.tyove.proj.service;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
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


	@Override
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);

        if (user != null) {
            return new org.springframework.security.core.userdetails.User(user.getEmail(),
                    user.getPassword(),
                    mapRolesToAuthorities(user.getRoles()));
        }else{
            throw new UsernameNotFoundException("Invalid username or password.");
        }
    }


}
