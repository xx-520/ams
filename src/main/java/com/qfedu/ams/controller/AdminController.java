package com.qfedu.ams.controller;

import com.github.pagehelper.Page;
import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.Admin;
import com.qfedu.ams.service.AdminService;
import com.qfedu.ams.utils.MD5Utils;
import com.qfedu.ams.vo.Pmenu;
import com.qfedu.ams.vo.VoAdmin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    // 设置权限的注解
    @RequestMapping("/queryMenu.do")
    @ResponseBody
    public JsonResult queryMenu() {
        Subject subject = SecurityUtils.getSubject();
        Admin admin = (Admin) subject.getSession().getAttribute("admin");
        List<Pmenu> menu = adminService.findMenu(admin.getUsername());

        JsonResult result = new JsonResult(1, menu);
        return result;
    }

    // 设置权限的注解
    @RequiresPermissions("admin:list")
    @RequestMapping("/queryAdmin.do")
    @ResponseBody
    public Map<String, Object> queryAdmin(String username, Integer page, Integer limit) {
        List<VoAdmin> list = adminService.findAdmin(username, page, limit);
        long total = ((Page) list).getTotal();

        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }

    @RequestMapping("/addAdmin.do")
    @ResponseBody
    public JsonResult addAdmin(Admin admin) {
        String password = admin.getPassword();
        String s = MD5Utils.md5("ams" + password);
        admin.setPassword(s);
        JsonResult result = null;
        try {
            adminService.addAdmin(admin);
            result = new JsonResult(1, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            result = new JsonResult(0, "添加失败");
        }
        return result;
    }

    @RequestMapping("/deleteOne.do")
    @ResponseBody
    public JsonResult deleteOne(Integer id) {
        JsonResult result = null;
        try {
            adminService.deleteOne(id);
            result = new JsonResult(1, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            result = new JsonResult(0, "删除失败");
        }
        return result;
    }

    @RequestMapping("/deleteMany.do")
    @ResponseBody
    public JsonResult deleteMany(Integer[] ids) {
        JsonResult result = null;

        try {
            adminService.deleteMany(ids);
            result = new JsonResult(1, "批量删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            result = new JsonResult(0, "批量删除失败");
        }

        return result;
    }

    @RequestMapping("/queryById.do")
    @ResponseBody
    public JsonResult findAdminById(Integer id) {
        Admin admin = adminService.findAdminById(id);
        JsonResult result = new JsonResult(1, admin);
        return result;
    }

    @RequestMapping("/updateAdmin.do")
    @ResponseBody
    public JsonResult updateAdminById(Admin admin) {
        JsonResult result = null;
        try {
            adminService.upateAdminById(admin);
            result = new JsonResult(1, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            result = new JsonResult(0, "更新失败");
        }
        return result;
    }

    @RequestMapping("/queryLoginInfo.do")
    @ResponseBody
    public JsonResult findLoginInfo() {
        Subject subject = SecurityUtils.getSubject();
        Admin admin = (Admin) subject.getSession().getAttribute("admin");
        JsonResult result = new JsonResult(1, admin);
        return result;
    }
}
