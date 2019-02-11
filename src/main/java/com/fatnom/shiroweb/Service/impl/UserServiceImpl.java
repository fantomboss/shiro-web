package com.fatnom.shiroweb.Service.impl;

import com.fatnom.shiroweb.Entity.User;

/**
 * @author fantomboss
 * @date 2019/2/9-11:39
 */
public interface UserServiceImpl {
  public User findByName(String name);
  public User findById(int id);
}
