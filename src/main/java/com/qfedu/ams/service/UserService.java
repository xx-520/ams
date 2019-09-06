package com.qfedu.ams.service;

import com.qfedu.ams.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    public void recoverU(Integer[] ids);

    public List<User> findRecover();
    /**
     * 【考生信息的管理】Service接口
     *
     * @author vae
     * @date 2019-08-28
     */

    /**
     * 查询指定ID的考生
     *
     * @param uid 需要查询考生的ID
     * @return
     */
    public User selectUserById(Integer uid);

    /**
     * 查询所有考生的信息
     *
     * @param user 需要查询的考生对象
     * @return
     */
    public List<User> selectUserList(User user,Integer page, Integer limit);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);

    /**
     * 新增考生
     *
     * @param user 新增考生的类对象
     * @return 结果
     */
    public int addUser(User user);

    /**
     * 修改考生的信息
     *
     * @param user 操作的考生的类对象
     * @return
     */
    public int updateUser(User user);

    /**
     * 批量删除考生
     *
     * @param ids 需要删除的考生ID
     * @return
     */
    public void deleteUserByIds(Integer[] ids);

    /**
     * 删除指定ID考生的信息
     *
     * @param uid 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteUserById(Integer uid);


   public User login(String username,String password);


    public User findAllUser(String username);
}


