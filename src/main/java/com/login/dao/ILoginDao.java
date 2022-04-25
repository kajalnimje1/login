package com.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.entities.Login;

@Repository
public interface ILoginDao extends JpaRepository<Login,Long>{

	//Login findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);

	Login findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);

}
