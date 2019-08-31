package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.Role;
import com.qfedu.ams.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/31
 * Time: 15:03
 */
@Controller
@RequestMapping("/admin")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/role/selectRole.do")
    @ResponseBody
    public JsonResult findAllRole() {
        List<Role> list = roleService.findAllRole();
        JsonResult result = new JsonResult(1, list);
        return result;
    }
}
