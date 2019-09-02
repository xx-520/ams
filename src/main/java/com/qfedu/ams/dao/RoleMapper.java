package com.qfedu.ams.dao;

import com.qfedu.ams.entity.Role;

import java.util.List;

//角色表
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    public List<Role> findAllRole();

    public void deleteRoleById(Integer id);
}