package com.login.service;

import org.springframework.context.annotation.Bean;

import com.login.entities.Login;


public interface ILoginService {

	Login dologin(Login login);

}
