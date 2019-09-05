package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.ExamSubject;
import com.qfedu.ams.service.ExamSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/5
 * Time: 21:48
 */
@Controller
public class IndexExamSubjectController {
    @Autowired
    private ExamSubjectService examSubjectService;

    @RequestMapping("/api/subject/findSubjectAll.do")
    @ResponseBody
    public JsonResult findSubjectAll() {
        List<ExamSubject> subjectList = examSubjectService.findAll();
        return new JsonResult(1, subjectList);
    }
}
