package com.symbiosys.demo;

//import java.util.*;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.model.Role;
//import com.model.User;
//import com.model.UserRole;
//import com.service.UserService;
@ComponentScan({"com.symbiosis.demo","com.controller","com.dao","com.model","com.service"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")
@SpringBootApplication
public class FinalProjectApplication implements CommandLineRunner{

//	@Autowired 
//	private UserService userservise;
	
	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting Code...");
		
		/*
		User user = new User();
		user.setName("Divya");
		user.setUsername("DivyaMayekar");
		user.setPassword("divya5321");
		user.setEmail("div7421@gmail.com");
		user.setPhone("8104831671");
		user.setProfile("default.png");
		
		Role role1 = new Role();
		role1.setRole_id(1L);
		role1.setRole_name("ADMIN");
		
		Set<UserRole> userRoleSet = new HashSet<>();
		
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		
		User user1 = this.userservise.addUser(user , userRoleSet);
		System.out.println(user1);
		*/
		
	}

	
}
