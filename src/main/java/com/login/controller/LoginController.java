package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.entities.Login;
import com.login.service.ILoginService;

@Configuration
@RestController
public class LoginController {

	@Autowired
	private ILoginService iLoginService;
	
	
	//POST
	@PostMapping("/login")
	public Login dologin(@RequestBody Login login) 
	{
	return this.iLoginService.dologin(login);	
	}	
}
