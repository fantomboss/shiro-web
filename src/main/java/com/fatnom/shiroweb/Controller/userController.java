package com.fatnom.shiroweb.Controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author fantomboss
 * @date 2019/2/8-18:13
 */
@Controller
public class userController {

  /**
   * 用户登录入口
   * @param name
   * @param password
   * @param model
   * @return
   */
  @RequestMapping("/userLogin")
  public String login(
          @RequestParam String name,
          @RequestParam String password,
          Model model){
    /**
     * 使用Shiro认证
     */
    //1、获取Subject
    Subject subject = SecurityUtils.getSubject();
    //2、封装用户数据
    UsernamePasswordToken token = new UsernamePasswordToken(name,password);
    //3、执行登录操作
    try {
      subject.login(token);
      //登录成功
      return "/host";
    }catch (UnknownAccountException e1){
      //账号不存在
      model.addAttribute("msg","账号不存在");
      return "/login";
    }catch (IncorrectCredentialsException e2){
      //密码错误
      model.addAttribute("msg","密码错误");
      return "/login";
    }
  }

}
