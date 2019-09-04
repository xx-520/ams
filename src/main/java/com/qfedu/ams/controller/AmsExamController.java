package com.qfedu.ams.controller;

import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.AmsExam;
import com.qfedu.ams.service.AmsExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AmsExamController {

    @Autowired
    private AmsExamService amsExamService;

    @RequestMapping("/admin/AE/list.do")
    @ResponseBody
    public JsonResult listAE(){
        List<AmsExam> list = amsExamService.findAll();
        return new JsonResult(1,list);
    }


}
