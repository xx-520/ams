package com.qfedu.ams.dao;

import com.qfedu.ams.entity.RolePermision;
//角色权限中间表
public interface RolePermisionMapper {
    int deleteByPrimaryKey(Integer rolePerId);

    int insert(RolePermision record);

    int insertSelective(RolePermision record);

    RolePermision selectByPrimaryKey(Integer rolePerId);

    int updateByPrimaryKeySelective(RolePermision record);

    int updateByPrimaryKey(RolePermision record);
}