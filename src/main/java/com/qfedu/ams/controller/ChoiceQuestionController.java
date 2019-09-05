package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.ChoiceQuestion;
import com.qfedu.ams.service.ChoiceQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ChoiceQuestionController {

    @Autowired
    private ChoiceQuestionService choiceQuestionService;

    @RequestMapping("/admin/CQ/recover.do")
    @ResponseBody
    public JsonResult recoverCQ(Integer[] ids){
        choiceQuestionService.recoverCQ(ids);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/CQ/list.do")
    @ResponseBody
    public JsonResult listCQ(){
        List<ChoiceQuestion> list = choiceQuestionService.findAll();
        return new JsonResult(1,list);
    }

    @RequestMapping("/admin/CQ/page.do")
    @ResponseBody
    public Map<String ,Object> pageCQ(Integer page, Integer limit){
        Map<String ,Object> map = choiceQuestionService.findByIndexAndSize(page,limit);
        return map;
    }

    @RequestMapping("/admin/CQ/RecoverpageCQ.do")
    @ResponseBody
    public Map<String ,Object> RecoverpageCQ(Integer page, Integer limit){
        Map<String ,Object> map = choiceQuestionService.findByIndexAndSize2(page,limit);
        return map;
    }

    @RequestMapping("/admin/CQ/add.do")
    @ResponseBody
    public JsonResult addCQ(ChoiceQuestion choiceQuestion){
        choiceQuestionService.insert(choiceQuestion);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/CQ/delete.do")
    @ResponseBody
    public JsonResult deleteCQ(Integer id){
        choiceQuestionService.falseDelete(id);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/CQ/deletes.do")
    @ResponseBody
    public JsonResult deletesCQ(Integer[] ids){
        choiceQuestionService.falseDeletes(ids);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/CQ/query.do")
    @ResponseBody
    public JsonResult findByIdCQ(Integer id){
        ChoiceQuestion cq = choiceQuestionService.selectByPrimaryKey(id);
        return new JsonResult(1,cq);
    }

    @RequestMapping("/admin/CQ/update.do")
    @ResponseBody
    public JsonResult updateCQ(ChoiceQuestion choiceQuestion){
        choiceQuestionService.update(choiceQuestion);
        return new JsonResult(1, null);
    }

}
