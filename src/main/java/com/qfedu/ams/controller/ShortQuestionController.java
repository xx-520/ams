package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.ShortQuestion;
import com.qfedu.ams.service.ShortQuestionSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 判断题控制层
 *
 * @author xx
 */
@Controller
public class ShortQuestionController {

    @Autowired
    private ShortQuestionSevice shortQuestionSevice;

    @RequestMapping("/admin/SQ/recover.do")
    @ResponseBody
    public JsonResult recoverSQ(Integer[] ids){
        shortQuestionSevice.recoverSQ(ids);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/SQ/list.do")
    @ResponseBody
    public JsonResult listSQ(){
        List<ShortQuestion> list = shortQuestionSevice.findAll();
        return new JsonResult(1,list);
    }

    @RequestMapping("/admin/SQ/RecoverpageSQ.do")
    @ResponseBody
    public Map<String ,Object> RecoverpageSQ(Integer page, Integer limit){
        Map<String ,Object> map = shortQuestionSevice.findByIndexAndSize2(page,limit);
        return map;
    }

    @RequestMapping("/admin/SQ/page.do")
    @ResponseBody
    public Map<String ,Object> pageSQ(Integer page, Integer limit){
        Map<String ,Object> map = shortQuestionSevice.findByIndexAndSize(page,limit);
        return map;
    }

    @RequestMapping("/admin/SQ/add.do")
    @ResponseBody
    public JsonResult addSQ(ShortQuestion shortQuestion){
        shortQuestionSevice.insert(shortQuestion);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/SQ/delete.do")
    @ResponseBody
    public JsonResult deleteSQ(Integer id){
        shortQuestionSevice.falseDelete(id);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/SQ/deletes.do")
    @ResponseBody
    public JsonResult deletesSQ(Integer[] ids){
        shortQuestionSevice.falseDeletes(ids);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/SQ/query.do")
    @ResponseBody
    public JsonResult findByIdSQ(Integer id){
        ShortQuestion cq = shortQuestionSevice.selectByPrimaryKey(id);
        return new JsonResult(1,cq);
    }

    @RequestMapping("/admin/SQ/update.do")
    @ResponseBody
    public JsonResult updateSQ(ShortQuestion shortQuestion){
        shortQuestionSevice.update(shortQuestion);
        return new JsonResult(1, null);
    }

}
