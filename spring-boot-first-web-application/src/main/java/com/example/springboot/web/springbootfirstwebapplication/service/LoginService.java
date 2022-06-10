package com.example.springboot.web.springbootfirstwebapplication.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userId, String password) {
		
		return userId.equalsIgnoreCase("jitesh") && password.equalsIgnoreCase("pass");
	}
}
