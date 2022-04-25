package com.login.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
//@Component
public class Login {
	//DECLARE VARIABLE
	@Id
	
		private String emailId;
		private String Password;
		
		
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		
		

}
