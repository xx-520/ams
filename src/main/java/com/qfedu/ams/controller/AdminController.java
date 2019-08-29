package com.qfedu.ams.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequiresPermissions("admin:add")
    @RequestMapping("list")
    public String userList() {
        return "list";
    }

    @RequestMapping("/notPermision")
    public String noPerms() {
        return "noPermision";
    }

}
