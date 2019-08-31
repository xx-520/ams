package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.Admin;
import com.qfedu.ams.service.AdminService;
import com.qfedu.ams.vo.Pmenu;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/queryMenu.do")
    @ResponseBody
    public JsonResult queryMenu() {
        Subject subject = SecurityUtils.getSubject();
        Admin admin = (Admin) subject.getSession().getAttribute("admin");
        List<Pmenu> menu = adminService.findMenu(admin.getUsername());

        JsonResult result = new JsonResult(1, menu);
        return result;
    }
}
