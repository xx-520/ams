package com.qfedu.ams.dao;

import com.qfedu.ams.entity.UserRole;
//用户角色中间表
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer userRoleId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer userRoleId);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}