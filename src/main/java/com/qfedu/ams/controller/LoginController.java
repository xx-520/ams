package com.qfedu.ams.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String name, String password){
        // 根据自己数据的用户名和密码信息创建token对象
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);
        // 获取Suject主体对象
        Subject subject = SecurityUtils.getSubject();

        try {
            // 进行登陆判断
            subject.login(token);
            return "index";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "login";
        }

    }

}
