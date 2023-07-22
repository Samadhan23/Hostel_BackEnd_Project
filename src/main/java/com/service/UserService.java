package com.service;

import java.util.Set;

import com.model.User;
import com.model.UserRole;

public interface UserService {

	//create user
	public User addUser(User user,Set<UserRole>userRole) throws Exception;
	
	//get user bt username
	public User getUser(String username);

//	public User deleteUser(long id);
}
