package com.htc.userdetails.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.userdetails.entity.user;


public interface UserServiceInterface  extends JpaRepository<user, Long>{
	
	

}
