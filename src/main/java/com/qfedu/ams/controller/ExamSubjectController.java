package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.ExamSubject;
import com.qfedu.ams.service.ExamSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

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

//    public JsonResult deleteES(Integer id){
//
//    }


}
