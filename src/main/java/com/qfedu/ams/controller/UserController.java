package com.qfedu.ams.controller;

import com.github.pagehelper.Page;
import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.User;
import com.qfedu.ams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    //实例化service对象
    @Autowired
    private UserService userService;

    /**
     * 展示所有考生
     * @param user 需要操作的考生类对象
     * @param page 第几页
     * @param limit 限制多少条
     * @return
     */
    @RequestMapping("/admin/us/listAllUser.do")
    @ResponseBody
    public Map<String, Object> listUser(User user, Integer page, Integer limit) {
        List<User> list = userService.selectUserList(user, page, limit);

        long total = ( (Page) list ).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;

    }

    /**
     * 查找指定ID的考生
     * @param uid 需要查询考生的ID
     * @return
     */
    @RequestMapping("/admin/us/selectUser.do")
    @ResponseBody
    public JsonResult select(Integer uid) {
        User user = userService.selectUserById(uid);
        JsonResult jsonResult = new JsonResult(1,user);
        return jsonResult;
    }


    /**
     * 添加考生
     * @param user 需要操作的user类对象
     * @return
     */
    @RequestMapping("/admin/us/addUser.do")
    @ResponseBody
    public JsonResult addUser(User user) {
        userService.addUser(user);
        JsonResult jsonResult = new JsonResult(1, null);
        return jsonResult;
    }

    /**
     * 删除指定ID的考生
     * @param uid 需要删除的考生ID
     * @return
     */
    @RequestMapping("/admin/us/deleteUser.do")
    @ResponseBody
    public JsonResult deleteUser(Integer uid) {
        userService.deleteUserById(uid);
        JsonResult jsonResult = new JsonResult(1, null);
        return jsonResult;
    }

    /**
     * 批量删除考生
     * @param ids 需要删除的考生ID
     * @return
     */
    @RequestMapping("/admin/us/deleteUsers.do")
    @ResponseBody
    public JsonResult deleteUsers(Integer[] ids) {
        userService.deleteUserByIds(ids);
        JsonResult jsonResult = new JsonResult(1, null);
        return jsonResult;
    }

    /**
     * 修改考生
     * @param user 需要操作的user类对象
     * @return
     */
    @RequestMapping("/admin/us/updateUser.do")
    @ResponseBody
    public JsonResult updateUser(User user) {
        userService.updateUser(user);
        JsonResult jsonResult = new JsonResult(1, null);
        return jsonResult;
    }

    @RequestMapping("/admin/us/RecoverpageU.do")
    @ResponseBody
    public Map<String, Object> RecoverpageU(Integer page, Integer limit) {
        Map<String, Object> map = userService.findByIndexAndSize(page,limit);
        return map;
    }

    @RequestMapping("/admin/us/recover.do")
    @ResponseBody
    public JsonResult recoverCQ(Integer[] ids){
        userService.recoverU(ids);
        return new JsonResult(1,null);
    }


}
