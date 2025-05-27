package com.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	// user name matching
	Users findByUsername(String username);
	
	// existing email
	Users findByEmail(String email);

}
