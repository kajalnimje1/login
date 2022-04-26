package com.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.login.controller", "com.login.service"})
@EnableJpaRepositories(basePackages = "com.login.dao")
@SpringBootApplication
public class LoginApplication {

  public static void main(String[] args) {
    SpringApplication.run(LoginApplication.class, args);
  }

}
