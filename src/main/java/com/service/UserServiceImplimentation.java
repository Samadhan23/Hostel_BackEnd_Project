package com.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RoleRepository;
import com.dao.UserRepository;
import com.model.User;
import com.model.UserRole;
@Service
public class UserServiceImplimentation implements UserService{

	@Autowired
	private UserRepository userRepo;
	 
	@Autowired
	private RoleRepository roleRepo;
	
	//create  user
	@Override
	public User addUser(User user, Set<UserRole> userRole) throws Exception {
		
		// TODO Auto-generated method stub
		User local = this.userRepo.findByUsername(user.getUsername());
		if(local!=null)
		{
			System.out.println("User is alredy Exist");
			throw new Exception("User is alredy present");
		}
		else
		{
				for(UserRole ur : userRole)	
				{
					roleRepo.save(ur.getRole());
				}
				user.getUserRoles().addAll(userRole);
				local = this.userRepo.save(user);
		}
		return local;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return userRepo.findByUsername(username);
	}

//	@Override
//	public User deleteUser(long id) {
//		// TODO Auto-generated method stub
//		return userRepo.findById(id);
//	}

}
