package com.qfedu.ams.controller;


import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.service.MarkShortService;
import com.qfedu.ams.vo.MarkShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Map;

@Controller

public class MarkShortController {

    @Autowired(required = false)
    private MarkShortService markShortService;

    @RequestMapping("/MarkShort/find.do")
    @ResponseBody
    public Map<String,Object> findShortByExamId(Integer username,String name,Integer page,Integer limit,
                                                Integer totalShortScore,String subjectName,String referenceanswer,Integer userId) {

        Map<String,Object> map = markShortService.findShortByExamId(username, name, page, userId, limit, totalShortScore, subjectName, referenceanswer);

        return map;
    }

    @RequestMapping("/MarkShort/query.do")
    @ResponseBody
    public JsonResult query(Integer userId,Integer examId) {

        MarkShort markShort = markShortService.findByUserId(userId,examId);

        return new JsonResult(1,markShort);
    }

    @RequestMapping("/MarkShort/update.do")
    @ResponseBody
    public JsonResult update(MarkShort markShort) {
        markShortService.updateMarkShort(markShort);

        return new JsonResult(1,null);
    }
}
