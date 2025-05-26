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
	
//	public Users userLogin(Users id) {
//		return repo.findById(id);
//	}

}
