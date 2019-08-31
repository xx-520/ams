package com.qfedu.ams.service.impl;

import com.qfedu.ams.dao.AdminMapper;
import com.qfedu.ams.entity.Admin;
import com.qfedu.ams.service.AdminService;
import com.qfedu.ams.vo.Pmenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/30
 * Time: 22:26
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired(required = false)
    private AdminMapper adminMapper;

    @Override
    public List<Pmenu> findMenu(String username) {
        List<Pmenu> menu = adminMapper.findMenu(username);
        return menu;
    }

    @Override
    public List<String> findPermsByName(String username) {
        List<String> perms = adminMapper.findPermsByName(username);
        return perms;
    }

    @Override
    public List<String> findRoleByName(String username) {
        List<String> roles = adminMapper.findRolesByName(username);
        return roles;
    }

    @Override
    public Admin findByName(String username) {
        Admin admin = adminMapper.findByName(username);
        return admin;
    }
}
