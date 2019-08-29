package com.qfedu.ams.dao;

import com.qfedu.ams.entity.Admin;
//后台用户表
public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}