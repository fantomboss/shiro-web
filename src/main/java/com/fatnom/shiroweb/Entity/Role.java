package com.fatnom.shiroweb.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fantomboss
 * @date 2019/2/9-10:22
 */
@Entity
@Data
public class Role {

  @Id
  @GeneratedValue
  private int roleId;

  private String roleName;

  @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  @JoinTable(name = "role_permission",joinColumns = @JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name = "permission_id"))
  private Set<Permission> permissions;
}
