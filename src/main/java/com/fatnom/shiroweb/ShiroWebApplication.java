package com.fatnom.shiroweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShiroWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShiroWebApplication.class, args);
    System.out.println("==============启动完毕==============");
  }

}

