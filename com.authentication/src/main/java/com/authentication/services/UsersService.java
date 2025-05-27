package com.authentication.services;

import com.authentication.entities.Users;

public interface UsersService {
	
	void userRegister(Users user);
	
	boolean userExist(String username);
	
	Users userLogin(Users user);

}
