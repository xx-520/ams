package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.Admin;
import com.qfedu.ams.entity.Permision;
import com.qfedu.ams.service.PermisionService;
import com.qfedu.ams.vo.TreeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/3
 * Time: 17:56
 */
@Controller
@RequestMapping("/admin")
public class PermisionController {
    @Autowired
    private PermisionService permisionService;

    @RequestMapping("/permision/getZTreeForUserRoles.do")
    @ResponseBody
    public List<TreeEntity> getTreeForUserRoles() {
        try {
            List<TreeEntity> treeList = new ArrayList<TreeEntity>();
            List<Permision> permisionList = permisionService.findAll();

            for (Permision permision : permisionList) {
                // 为tree树节点添加数据，节点pid为0的都是父节点，其他为子节点
                if(permision.getParentId() != null){
                    if (permision.getParentId() == 0) {
                        treeList.add(new TreeEntity(permision.getPid(), permision.getResourceName(), true, (Integer) 0));
                    } else {
                        treeList.add(new TreeEntity(permision.getPid(), permision.getResourceName(), false, permision.getParentId()));
                    }
                }
            }
            return treeList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/permision/getZTreeByRoles.do")
    @ResponseBody
    public List<TreeEntity> getZTreeByRoles(Integer id) {
        try {
            List<TreeEntity> treeList = new ArrayList<TreeEntity>();
            List<Permision> permisionList = permisionService.findPermisionByRoles(id);

            for (Permision permision : permisionList) {
                // 为tree树节点添加数据，节点pid为0的都是父节点，其他为子节点
                if(permision.getParentId() != null){
                    if (permision.getParentId() == 0) {
                        treeList.add(new TreeEntity(permision.getPid(), permision.getResourceName(), true, (Integer) 0));
                    } else {
                        treeList.add(new TreeEntity(permision.getPid(), permision.getResourceName(), false, permision.getParentId()));
                    }
                }
            }
            return treeList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/permision/updatePermision.do")
    @ResponseBody
    public JsonResult updatePermision(Integer[] ids, Integer id) {
        JsonResult result = null;
        try {
            permisionService.updatePermision(ids, id);
            result = new JsonResult(1, "权限更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            result = new JsonResult(0, "权限更新失败");
        }
        return result;

    }
}
