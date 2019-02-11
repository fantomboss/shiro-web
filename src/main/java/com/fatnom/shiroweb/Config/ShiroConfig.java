package com.fatnom.shiroweb.Config;

import com.fatnom.shiroweb.Realm.ShiroRealm;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Shiro的配置类
 * @author fantomboss
 * @date 2019/2/8-11:34
 */
@Configuration
public class ShiroConfig {

  /**
   * 创建 ShiroFilterFactoryBean
   */
  @Bean
  public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultSecurityManager securityManager){
    ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
    //关联securityManager安全管理器
    shiroFilterFactoryBean.setSecurityManager(securityManager);
    /**
     * anon：  无需登录认证
     * authc： 需要登录认证
     * user：  使用rememberMe功能记住用户，下次不用再登录
     * perms:  资源授权
     * role:   角色授权
     *
     * logout 登出
     */
    Map<String,String> filterMap = new LinkedHashMap<String, String>();
    filterMap.put("/host","anon");
    filterMap.put("/userLogin","anon");
    filterMap.put("/api/back","roles[root]");
    filterMap.put("/api/update","perms[user/update]");
    filterMap.put("/api/add","perms[user/add]");
    filterMap.put("/logout","logout");
    filterMap.put("/*","authc");
    shiroFilterFactoryBean.setUnauthorizedUrl("/noPermission");
    shiroFilterFactoryBean.setLoginUrl("/login");

    shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
    return shiroFilterFactoryBean;
  }


  /**
   * 创建 DefaultWebSecurityManager
   */
  @Bean(name = "securityManager")
  public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("shiroRealm") ShiroRealm realm){
    DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
    //关联Reaml
    securityManager.setRealm(realm);
    return  securityManager;
  }

  /**
   * 创建 Realm
   */
  @Bean(name = "shiroRealm")
  public ShiroRealm getRealm(){
    return new ShiroRealm();
  }
}
