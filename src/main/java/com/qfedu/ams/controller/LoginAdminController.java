package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.Admin;
import com.qfedu.ams.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/30
 * Time: 22:25
 */
@Controller
@RequestMapping("/loginAdmin")
public class LoginAdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult loginAdmin(String username, String password) {
        // 根据自己输入的用户名和密码信息创建token对象
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 获取subject主体对象
        Subject subject = SecurityUtils.getSubject();
        JsonResult result = null;
        Admin admin = null;
        try {
            subject.login(token);
            admin = adminService.findByName(username);
            subject.getSession().setAttribute("admin", admin);
            result = new JsonResult(1, null);
            return result;
        } catch (AuthenticationException e) {
            e.printStackTrace();
            result = new JsonResult(0, "登录失败");
            return result;
        }

    }
}
