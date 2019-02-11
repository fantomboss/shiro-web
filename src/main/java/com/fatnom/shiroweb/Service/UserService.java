package com.fatnom.shiroweb.Service;

import com.fatnom.shiroweb.Entity.User;
import com.fatnom.shiroweb.JpaRepository.UserRepository;
import com.fatnom.shiroweb.Service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author fantomboss
 * @date 2019/2/9-10:55
 */
@Service
public class UserService implements UserServiceImpl {

  @Autowired
  private UserRepository userRepository;

  //userId查询
  public User findById(int id) {
   return userRepository.findByUserId(id);
  }

  //查寻账号
  public User findByName(String name){
    return userRepository.findByName(name);
  }


}
