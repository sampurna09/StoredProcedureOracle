package com.oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.repository.AppUserRepository;


@RestController
public class HomeController {
	
	@Autowired
	private AppUserRepository appUserRepository;
	
	@RequestMapping("/specific/{email}")
	public String findSUser(@PathVariable String email){
		System.out.println("sssss");
		return appUserRepository.getSpecificeName(email);
	}

}
