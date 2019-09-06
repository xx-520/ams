package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.User;
import com.qfedu.ams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/6
 * Time: 10:45
 */
@Controller
public class IndexUserController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserService userService;



    @RequestMapping("/api/user/findAllUser.do")
    @ResponseBody
    public JsonResult findAllUser(ServletRequest servletRequest) {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        String token = req.getHeader("token");
        String username = redisTemplate.opsForValue().get(token);
        User userList = userService.findAllUser(username);
        JsonResult result = new JsonResult(1, userList);
        return result;
    }
}
