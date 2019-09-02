package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.ChoiceQuestion;
import com.qfedu.ams.entity.JudgeQuestion;
import com.qfedu.ams.service.ChoiceQuestionService;
import com.qfedu.ams.service.JudgeQuestiomSevice;
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
public class JudegQuestionController {

    @Autowired
    private JudgeQuestiomSevice judgeQuestiomSevice;

    @RequestMapping("/admin/JQ/list.do")
    @ResponseBody
    public JsonResult listCQ(){
        List<JudgeQuestion> list = judgeQuestiomSevice.findAll();
        return new JsonResult(1,list);
    }

    @RequestMapping("/admin/JQ/page.do")
    @ResponseBody
    public Map<String ,Object> pageJQ(Integer page, Integer limit){
        Map<String ,Object> map = judgeQuestiomSevice.findByIndexAndSize(page,limit);
        return map;
    }

    @RequestMapping("/admin/JQ/add.do")
    @ResponseBody
    public JsonResult addJQ(JudgeQuestion judgeQuestion){
        judgeQuestiomSevice.insert(judgeQuestion);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/JQ/delete.do")
    @ResponseBody
    public JsonResult deleteJQ(Integer id){
        judgeQuestiomSevice.falseDelete(id);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/JQ/deletes.do")
    @ResponseBody
    public JsonResult deletesJQ(Integer[] ids){
        judgeQuestiomSevice.falseDeletes(ids);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/JQ/query.do")
    @ResponseBody
    public JsonResult findByIdJQ(Integer id){
        JudgeQuestion cq = judgeQuestiomSevice.selectByPrimaryKey(id);
        return new JsonResult(1,cq);
    }

    @RequestMapping("/admin/JQ/update.do")
    @ResponseBody
    public JsonResult updateJQ(JudgeQuestion judgeQuestion){
        judgeQuestiomSevice.update(judgeQuestion);
        return new JsonResult(1, null);
    }
}
