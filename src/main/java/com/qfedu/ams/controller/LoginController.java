package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.Admin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@ResponseBody
public class LoginController {

    @RequestMapping("/login")
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


/*
    public JsonResult login(@Valid Admin a, BindingResult bindResult, HttpSession session) {
        boolean ret = bindResult.hasErrors();
        if (ret) {
            List<ObjectError> allErrors = bindResult.getAllErrors();
            for (ObjectError err :
                    allErrors) {
                FieldError error = err;
            }
        }
    }*/


}
