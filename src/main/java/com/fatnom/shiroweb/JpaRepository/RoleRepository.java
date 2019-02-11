package com.fatnom.shiroweb.JpaRepository;

import com.fatnom.shiroweb.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fantomboss
 * @date 2019/2/9-10:52
 */
public interface RoleRepository extends JpaRepository<Role,Integer> {
  Role findByRoleId(int id);
}
