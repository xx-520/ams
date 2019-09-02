package com.qfedu.ams.service;

import com.qfedu.ams.entity.Role;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/31
 * Time: 15:04
 */
public interface RoleService {
    public List<Role> selectRole();

    public List<Role> findAllRole(Integer page, Integer limit);

    public void addRole(Role role);

    public void deleteRoleById(Integer id);

    public Role findRoleById(Integer id);

    public void updateRoleById(Role role);
}
