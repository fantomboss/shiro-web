package com.fatnom.shiroweb.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author fantomboss
 * @date 2019/2/9-10:22
 */
@Data
@Entity
public class Permission {

  @Id
  @GeneratedValue
  private int permissionId;

  private String permissionName;
}
