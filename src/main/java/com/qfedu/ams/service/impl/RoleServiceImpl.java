package com.qfedu.ams.service.impl;

import com.qfedu.ams.dao.RoleMapper;
import com.qfedu.ams.entity.Role;
import com.qfedu.ams.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/31
 * Time: 15:04
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired(required = false)
    private RoleMapper roleMapper;

    @Override
    public List<Role> findAllRole() {
        List<Role> list = roleMapper.findAllRole();
        return list;
    }
}
