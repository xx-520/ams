package com.qfedu.ams.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.ams.dao.UserMapper;
import com.qfedu.ams.entity.User;
import com.qfedu.ams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 彦
 * @data 2019-08-28
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public void recoverU(Integer[] ids) {
        userMapper.recoverU(ids);
    }

    @Override
    public List<User> findRecover() {
        List<User> list = userMapper.findRecover();

        return list;
    }

    @Override
    public User selectUserById(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public List<User> selectUserList(User user,Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        return userMapper.selectUserList(user);

    }

    @Override
    public Map<String, Object> findByIndexAndSize(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<User> list = userMapper.findRecover();
        // 获取总记录数
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUserByIds(Integer[] ids) {
        userMapper.deleteUserByIds(ids);
    }

    @Override
    public int deleteUserById(Integer uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public User login(String username, String password) {
        User user = userMapper.login(username);
        if ( user == null ) {
            throw new RuntimeException( "账号错误" );
        }
        if (!user.getPassword().equals( password )) {
            throw new RuntimeException( "密码错误" );
        }
        return user;
    }

}
