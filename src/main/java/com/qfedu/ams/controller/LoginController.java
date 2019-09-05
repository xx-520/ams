package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.User;
import com.qfedu.ams.service.UserService;
import com.qfedu.ams.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private UserService userService;

    @RequestMapping("/api/login.do")
    public Map<String, Object> login(String username, String password, String vercode) {
        Map<String, Object> map = new HashMap<>();

        User login = null;
        String token = null;
        try {
            login = userService.login( username, password );
            token = MD5Utils.md5( username + "ams" );
            map.put( "token", token );
            map.put( "code", 1 );

            // 将token写道redis中
            redisTemplate.opsForValue().set(token, username);
            redisTemplate.expire( token, 1800, TimeUnit.SECONDS );
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", 0);
        }
        return map;

    }

    @RequestMapping("/api/cookie.do")
    public Map<String, Object> testCookie(@CookieValue(value = "JSESSIONID", required = false) String jsessionid) {
        System.out.println( jsessionid );
        System.out.println( "cookie.do" );

        Map<String, Object> map = new HashMap<>();
        map.put( "info", "haha" );
        return map;
    }


}
