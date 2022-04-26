package com.login.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.login.entities.Login;

@Repository
public interface ILoginDao extends JpaRepository<Login, Long> {

  // Login findOneByEmailIdIgnoreCaseAndPassword(String emailId, String password);

  public List<Login> findByEmailId(String emailId);

}
