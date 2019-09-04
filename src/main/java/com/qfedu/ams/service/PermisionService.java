package com.qfedu.ams.service;

import com.qfedu.ams.entity.Permision;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/3
 * Time: 17:59
 */
public interface PermisionService {

    public List<Permision> findAll();

    public List<Permision> findPermisionByRoles(Integer id);

    public void updatePermision(Integer[] ids, Integer id);
}
