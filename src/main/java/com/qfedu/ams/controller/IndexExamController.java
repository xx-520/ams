package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.ChoiceQuestion;
import com.qfedu.ams.entity.JudgeQuestion;
import com.qfedu.ams.entity.ShortQuestion;
import com.qfedu.ams.service.AmsExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/6
 * Time: 12:04
 */
@Controller
public class IndexExamController {
    @Autowired
    private AmsExamService amsExamService;

    @RequestMapping("/api/exam/queryChoiceQuestion.do")
    @ResponseBody
    public JsonResult findChoiceQuestion(Integer examNum) {
        List<ChoiceQuestion> list = amsExamService.findExamChoiceQuestion(examNum);
        JsonResult result = new JsonResult(1, list);
        return result;
    }

    @RequestMapping("/api/exam/queryJudgeQuestion.do")
    @ResponseBody
    public JsonResult findJudgeQuestion(Integer examNum) {
        List<JudgeQuestion> list = amsExamService.findExamJudegQuestion(examNum);
        JsonResult result = new JsonResult(1, list);
        return result;
    }

    @RequestMapping("/api/exam/queryShortQuestion.do")
    @ResponseBody
    public JsonResult findShortQuestion(Integer examNum) {
        List<ShortQuestion> shortQuestion = amsExamService.findExamShortQuestion(examNum);
        JsonResult result = new JsonResult(1, shortQuestion);
        return result;
    }
}
