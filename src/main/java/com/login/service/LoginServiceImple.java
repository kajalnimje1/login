package com.login.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import com.login.dao.ILoginDao;
import com.login.entities.Login;

@Service
@Configuration
public class LoginServiceImple {


  @Autowired
  private ILoginDao iLoginDao;

  // @Bean
  public Login dologin(Login login) {
    // TODO Auto-generated method stub

    Login loginn = new Login();

    // VALIDATION

    // VARIFY USER EXIST WITH USERNAME &PASSWORD

    List<Login> login6 = iLoginDao.findByEmailId(login.getEmailId());

    loginn.setEmailId(login.getEmailId());
    loginn.setPassword(login.getPassword());
    // RESPONSE
    if (login6 == null) {
      // loginn.setData("User login failed");
      System.out.println("failed:" + loginn);

    } else {
      System.out.println("suceessd:" + loginn);
    }
    iLoginDao.save(loginn);
    return loginn;
  }

}
