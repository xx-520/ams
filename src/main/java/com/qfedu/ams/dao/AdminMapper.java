package com.qfedu.ams.dao;

import com.qfedu.ams.entity.Admin;
import com.qfedu.ams.vo.Pmenu;
import com.qfedu.ams.vo.VoAdmin;

import java.util.List;

/**
 * 后台用户表
 */
public interface AdminMapper {

    public Admin selectByPrimaryKey(Integer id);


    int updateByPrimaryKey(Admin record);


    /**
     * 根据用户名
     */
    public Admin findByName(String username);

    /**
     * 根据登陆用户的用户名获取用户角色信息
     */
    public List<String> findRolesByName(String username);

    /**
     * 根据登陆用户的用户名获取权限信息
     */
    public List<String> findPermsByName(String username);

    public List<Pmenu> findMenu(String username);

    public List<VoAdmin> findAdmin(String username);

    public void addAdmin(Admin admin);

    public void deleteOne(Integer id);

    public void deleteMany(Integer[] ids);
}