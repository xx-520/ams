package com.qfedu.ams.dao;

import com.qfedu.ams.entity.User;

import java.util.List;
import java.util.Map;

//考生表
public interface UserMapper {
    //删除指定ID考生
    int deleteByPrimaryKey(Integer uid);

    //批量删除考生
    public void deleteUserByIds(Integer[] ids);

    public void recoverU(Integer[] ids);

    //添加考生
    int insert(User record);

//    动态添加
//    int insertSelective(User record);

    //查询指定ID的考生
    User selectByPrimaryKey(Integer uid);

    //查询所有的考生
    public List<User> selectUserList(User users);

    public List<User> findRecover();

    //动态修改
//    int updateByPrimaryKeySelective(User record);

    //修改指定ID的考生
    int updateByPrimaryKey(User record);

    public User login(String username);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);


}