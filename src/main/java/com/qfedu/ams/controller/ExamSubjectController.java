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

    @RequestMapping("/ES/list.do")
    @ResponseBody
    public JsonResult listES(){
        List<ExamSubject> list = examSubjectService.findAll();
        return new JsonResult(1, list);
    }

    @RequestMapping("/ES/add.do")
    public String addES(ExamSubject examSubject){
        examSubjectService.insert(examSubject);
        return "redirect:/ES/list.do";
    }

    @RequestMapping("/ES/delete.do")
    public String deleteES(Integer id){
        examSubjectService.deleteByPrimaryKey(id);
        return "redirect:/ES/list.do";
    }

    @RequestMapping("/ES/update.do")
    public String updateES(ExamSubject examSubject){
        examSubjectService.updateByPrimaryKey(examSubject);
        return "redirect:/ES/list.do";
    }

    @RequestMapping("/ES/query.do")
    @ResponseBody
    public JsonResult findByIdES(Integer id){
        ExamSubject examSubject = examSubjectService.selectByPrimaryKey(id);
        return new JsonResult(1,examSubject);
    }

    @RequestMapping("/ES/page.do")
    public Map<String, Object> findByPage(String subjectName, Integer page, Integer limit){
        Map<String, Object> map = examSubjectService.findByIndexAndSize(subjectName,page, limit);
        return map;
    }

}
