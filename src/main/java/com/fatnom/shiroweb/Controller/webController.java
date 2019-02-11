package com.fatnom.shiroweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fantomboss
 * @date 2019/2/8-15:56
 */
@Controller
public class webController {

  @RequestMapping("/host")
  public String host(){
    return "/host";
  }

  @RequestMapping("/api/add")
  public String add(){
    return "/add";
  }

  @RequestMapping("/api/update")
  public String update(){
    return "/update";
  }

  @RequestMapping("/noPermission")
  public String noPermission(){
    return "/noPermission";
  }

  @RequestMapping("/login")
  public String login(){
    return "/login";
  }

  @RequestMapping("/api/back")
  public String root(){
    return "/root";
  }
}
