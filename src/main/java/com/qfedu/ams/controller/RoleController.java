package com.qfedu.ams.controller;

import com.github.pagehelper.Page;
import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.Role;
import com.qfedu.ams.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public JsonResult selectRole() {
        List<Role> list = roleService.selectRole();
        JsonResult result = new JsonResult(1, list);
        return result;
    }

    @RequestMapping("/role/queryRole.do")
    @ResponseBody
    public Map<String, Object> findAllRole(Integer page, Integer limit) {
        List<Role> list = roleService.findAllRole(page, limit);

        long total = ((Page) list).getTotal();

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }

    @RequestMapping("/role/addRole.do")
    @ResponseBody
    public JsonResult addRole(Role role) {
        JsonResult result = null;
        try {
            roleService.addRole(role);
            result = new JsonResult(1, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            result = new JsonResult(0, "添加失败");
        }
        return result;
    }

    @RequestMapping("/role/deleteRole.do")
    @ResponseBody
    public JsonResult deleteRole(Integer id) {
        JsonResult result = null;
        try {
            roleService.deleteRoleById(id);
            result = new JsonResult(1, "添加角色成功");
        } catch (Exception e) {
            e.printStackTrace();
            result = new JsonResult(0, "添加角色失败");
        }
        return result;
    }

    @RequestMapping("/role/queryRoleById.do")
    @ResponseBody
    public JsonResult findRoleById(Integer id) {
        Role role = roleService.findRoleById(id);
        JsonResult result = new JsonResult(1, role);
        return result;
    }

    @RequestMapping("/role/updateRole.do")
    @ResponseBody
    public JsonResult updateRoleById(Role role) {
        JsonResult result = null;
        try {
            roleService.updateRoleById(role);
            result = new JsonResult(1, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            result = new JsonResult(0, "更新失败");
        }
        return result;
    }

}
