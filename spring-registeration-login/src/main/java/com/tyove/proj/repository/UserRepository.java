package com.tyove.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyove.proj.model.User;
@Repository
public interface UserRepository extends  JpaRepository<User,Long> {
	User findByEmail(String email);
}
