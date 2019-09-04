package com.qfedu.ams.service.impl;

import com.qfedu.ams.dao.PermisionMapper;
import com.qfedu.ams.entity.Permision;
import com.qfedu.ams.entity.RolePermision;
import com.qfedu.ams.service.PermisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/3
 * Time: 17:59
 */
@Service
public class PermisionServiceImpl implements PermisionService {
    @Autowired(required = false)
    private PermisionMapper permisionMapper;

    @Override
    public List<Permision> findAll() {
        List<Permision> list = permisionMapper.findAll();
        return list;
    }

    @Override
    public List<Permision> findPermisionByRoles(Integer id) {
        List<Permision> permisionByRoles = permisionMapper.findPermisionByRoles(id);
        return permisionByRoles;
    }

    @Override
    public void updatePermision(Integer[] ids, Integer rid) {
        permisionMapper.deleteRoPermisionByRid(rid);
        List<RolePermision> list = new ArrayList<>();
        for (Integer id : ids) {
            list.add(new RolePermision(rid, id));
        }
        permisionMapper.updateRopermisionByIds(list);
    }
}
