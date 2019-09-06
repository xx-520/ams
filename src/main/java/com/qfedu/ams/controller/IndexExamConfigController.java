package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.ExamConfig;
import com.qfedu.ams.service.ExamConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/9/6
 * Time: 8:39
 */
@Controller
public class IndexExamConfigController {
    @Autowired
    private ExamConfigService examConfigService;

    @RequestMapping("/api/examConfig/findAllExamConfig.do")
    @ResponseBody
    public JsonResult findAllExamConfig() {
        List<ExamConfig> list = examConfigService.findAllExamConfig();
        JsonResult result = new JsonResult(1, list);
        return result;
    }
}
