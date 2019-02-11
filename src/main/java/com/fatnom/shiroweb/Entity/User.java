package com.fatnom.shiroweb.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fantomboss
 * @date 2019/2/9-10:20
 */
@Entity
@Data
public class User {

  @Id
  @GeneratedValue
  private int userId;

  private String name;
  private String password;

  @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  @JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles;

}
