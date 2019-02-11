package com.fatnom.shiroweb.JpaRepository;

import com.fatnom.shiroweb.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fantomboss
 * @date 2019/2/9-10:52
 */
public interface UserRepository extends JpaRepository<User,Integer> {

  User findByUserId(int id);
  User findByName(String name);
}
