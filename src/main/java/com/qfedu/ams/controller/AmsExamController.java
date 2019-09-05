package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.AmsExam;
import com.qfedu.ams.entity.ChoiceQuestion;
import com.qfedu.ams.entity.JudgeQuestion;
import com.qfedu.ams.entity.ShortQuestion;
import com.qfedu.ams.service.AmsExamService;
import com.qfedu.ams.service.ChoiceQuestionService;
import com.qfedu.ams.service.JudgeQuestiomSevice;
import com.qfedu.ams.service.ShortQuestionSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author xx
 */
@Controller
public class AmsExamController {

    @Autowired
    private AmsExamService amsExamService;

    @Autowired
    private ChoiceQuestionService choiceQuestion;

    @Autowired
    private ShortQuestionSevice shortQuestionSevice;

    @Autowired
    private JudgeQuestiomSevice judgeQuestiomSevice;


    @RequestMapping("/admin/AE/CQlist.do")
    @ResponseBody
    public JsonResult listCQ(Integer subjectid, Integer num, Integer jnum, Integer snum) {
        AmsExam amsExam = new AmsExam();

        amsExam.setChoiceid(choiceQuestion.CQfindAll(subjectid, num));
        amsExam.setJudgeid(judgeQuestiomSevice.CQfindAll(subjectid, jnum));
        amsExam.setShortid(shortQuestionSevice.CQfindAll(subjectid, snum));
        try {
            amsExamService.add(amsExam);
            return new JsonResult(1, null);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "生成失败");
        }
    }

    @RequestMapping("/admin/AE/list.do")
    @ResponseBody
    public JsonResult listAE() {
        List<AmsExam> list = amsExamService.findAll();
        return new JsonResult(1, list);
    }

    @RequestMapping("/admin/AE/delete.do")
    @ResponseBody
    public JsonResult deleteById(Integer id) {
        amsExamService.deleteById(id);
        return new JsonResult(1, null);
    }

    @RequestMapping("/admin/AE/page.do")
    @ResponseBody
    public Map<String, Object> pageCQ(Integer page, Integer limit) {
        Map<String, Object> map = amsExamService.findByIndexAndSize(page, limit);
        return map;
    }


    @RequestMapping("/admin/exam/queryChoiceQuestion.do")
    @ResponseBody
    public JsonResult findChoiceQuestion(Integer id) {
        List<ChoiceQuestion> list = amsExamService.findChoiceQuestion(id);
        JsonResult result = new JsonResult(1, list);
        return result;
    }

    @RequestMapping("/admin/exam/queryJudgeQuestion.do")
    @ResponseBody
    public JsonResult findJudgeQuestion(Integer id) {
        List<JudgeQuestion> list = amsExamService.findJudegQuestion(id);
        JsonResult result = new JsonResult(1, list);
        return result;
    }

    @RequestMapping("/admin/exam/queryShortQuestion.do")
    @ResponseBody
    public JsonResult findShortQuestion(Integer id) {
        List<ShortQuestion> shortQuestion = amsExamService.findShortQuestion(id);
        JsonResult result = new JsonResult(1, shortQuestion);
        return result;
    }

}
