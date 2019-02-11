package com.fatnom.shiroweb.Service;

import com.fatnom.shiroweb.Entity.Role;
import com.fatnom.shiroweb.JpaRepository.RoleRepository;
import com.fatnom.shiroweb.Service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.PrimitiveIterator;

/**
 * @author fantomboss
 * @date 2019/2/9-10:56
 */
@Service
public class RoleService implements RoleServiceImpl {

  @Autowired
  private RoleRepository roleRepository;

  @Override
  public Role findById(int id) {
    return roleRepository.findByRoleId(id);
  }
}
