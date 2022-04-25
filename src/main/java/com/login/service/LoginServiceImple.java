package com.login.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.login.dao.ILoginDao;
import com.login.entities.Login;

@Service
@Configuration
public class LoginServiceImple implements ILoginService {

	
	@Autowired
	private ILoginDao iLoginDao;
	
	//@Bean
	@Override
	public Login dologin(Login login) {
		// TODO Auto-generated method stub

Login loginn =new Login();
        
        //VALIDATION
        
        //VARIFY USER EXIST WITH USERNAME &PASSWORD
     
    Login login6=iLoginDao.findOneByEmailIdIgnoreCaseAndPassword(login.getEmailId(),login.getPassword());
    
        //RESPONSE
        if(login6 ==null) {
        	//loginn.setData("User login failed");
        	System.out.println("failed:" +loginn);	
        	
        }else {
        	System.out.println("suceessd:" +loginn);
        }
        iLoginDao.save(loginn);
        return loginn;
	}

}
