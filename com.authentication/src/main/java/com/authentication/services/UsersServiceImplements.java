package com.authentication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.entities.Users;
import com.authentication.repository.UsersRepository;

@Service
public class UsersServiceImplements implements UsersService {
	
	@Autowired
	UsersRepository repo;
	
	public void userRegister(Users user) {
		repo.save(user);
	}
	
	// user existing object
	public boolean userExist(String username) {
		Users user = repo.findByUsername(username);
		
		if (user != null) 
			return true;
		else 
			return false;
	}
	
	
	public Users userLogin(Users user) {
	    
		Users existingUser = repo.findByEmail(user.getEmail());
		
		if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
			return existingUser;
		}
		
		return null;
	}

}
