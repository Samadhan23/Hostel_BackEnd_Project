package com.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Role;
import com.model.User;
import com.model.UserRole;
import com.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	UserService userservise;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) throws Exception
	{
		user.setProfile("default.png");
//		Set<UserRole> roles = new HashSet<>();
		Role role = new Role();
		role.setRole_id(2L);
		role.setRole_name("NORMAL");
		
		/*
		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(new UserRole());
		*/
		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		
		return this.userservise.addUser(user , userRoleSet);
		
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username)
	{
		return userservise.getUser(username);
	}
	
	//delete by id
//	@GetMapping("/{userId}")
//	public void deleteUser(@PathVariable("userId")Long userId)
//	{
//		this.userservise.deleteUser(userId);
//	}
	
}
