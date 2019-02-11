package com.fatnom.shiroweb.JpaRepository;

import com.fatnom.shiroweb.Entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fantomboss
 * @date 2019/2/9-10:53
 */
public interface PermissionRepository extends JpaRepository<Permission,Integer> {
}
