package com.qfedu.ams.service;

import com.qfedu.ams.entity.Admin;
import com.qfedu.ams.vo.Pmenu;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/30
 * Time: 22:26
 */
public interface AdminService {
    public List<Pmenu> findMenu(String username);

    public List<String> findPermsByName(String username);

    public List<String> findRoleByName(String username);

    public Admin findByName(String username);

    public List<Admin> findAdmin(String username, Integer page, Integer limit);

    public void addAdmin(Admin admin);

    public void deleteOne(Integer id);

    public void deleteMany(Integer[] ids);
}
