package com.tyove.proj.readlist;

import java.util.Arrays;
import java.util.Collection;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
@Entity
public class Reader implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String username;
	private String fullname;
	private String password;
	
	public String getUsername() {
		return username;
		}
	public void setUsername(String username) {
		this.username = username;
		}
	public String getFullname() {
		return fullname;
		}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
		}
	
	public String getPassword() {
		return password;
		}
	
	public void setPassword(String password) {
		this.password = password;
		}
	
	//grants reader privledge
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Arrays.asList(new SimpleGrantedAuthority("READER"));
	}

	


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
