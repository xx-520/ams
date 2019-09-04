package com.qfedu.ams.dao;

import com.qfedu.ams.entity.Permision;
import com.qfedu.ams.entity.RolePermision;

import java.util.List;

//权限表
public interface PermisionMapper {

    public List<Permision> findAll();

    public List<Permision> findPermisionByRoles(Integer id);

    public void deleteRoPermisionByRid(Integer rid);

    public void updateRopermisionByIds(List<RolePermision> list);
}