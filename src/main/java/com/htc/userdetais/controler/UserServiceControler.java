package com.htc.userdetais.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.userdetails.entity.user;
import com.htc.userdetails.service.UserServiceInterface;



@RestController
@RequestMapping("/api")
public class UserServiceControler {

	@Autowired
	UserServiceInterface userServiceInterface;
	
	@PostMapping("/adduser") 
	public user createNewUser(@RequestBody user userService) {
		   
		 return userServiceInterface.save(userService);
		 
	}
	
}
