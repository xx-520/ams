package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.ExamSubject;
import com.qfedu.ams.service.ExamSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 学科控制层
 *
 * @author xx
 */
@Controller
public class ExamSubjectController {

    @Autowired
    private ExamSubjectService examSubjectService;

    @RequestMapping("/admin/ES/list.do")
    @ResponseBody
    public JsonResult listES(){
        List<ExamSubject> list = examSubjectService.findAll();
        return new JsonResult(1, list);
    }

    @RequestMapping("/admin/ES/add.do")
    @ResponseBody
    public JsonResult addES(ExamSubject examSubject){
        int insert = examSubjectService.insert(examSubject);
        return new JsonResult(1, insert);
    }

    @RequestMapping("/admin/ES/delete.do")
    public JsonResult deleteES(Integer id){
        examSubjectService.deleteByPrimaryKey(id);
        return new JsonResult(1,null);
    }

    @RequestMapping("/admin/ES/query.do")
    @ResponseBody
    public JsonResult findByIdES(Integer id){
        ExamSubject examSubject = examSubjectService.selectByPrimaryKey(id);
        return new JsonResult(1,examSubject);
    }

    @RequestMapping("/admin/ES/page.do")
    @ResponseBody
    public Map<String, Object> findByPage(Integer page, Integer limit){
        Map<String, Object> map = examSubjectService.findByIndexAndSize(page, limit);
        return map;
    }

}
