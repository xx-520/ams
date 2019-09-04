package com.qfedu.ams.controller;

import com.github.pagehelper.Page;
import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.ExamConfig;
import com.qfedu.ams.entity.User;
import com.qfedu.ams.service.ExamConfigService;
import com.qfedu.ams.vo.VoExamConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ExamConfigController {
    @Autowired
    private ExamConfigService examConfigService;

    @RequestMapping("/admin/EC/listAllEC.do")
    @ResponseBody
    public Map<String, Object> listEC(String name, String subjectName, Integer page, Integer limit) {
        List<VoExamConfig> list = examConfigService.selectUserList( name, subjectName, page, limit );
        long total = ( (Page) list ).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put( "code", 0 );
        map.put( "msg", "" );
        map.put( "count", total );
        map.put( "data", list );
        return map;

    }

    @RequestMapping("/admin/EC/selectEC.do")
    @ResponseBody
    public JsonResult select(Integer id) {
        ExamConfig examConfig = examConfigService.selectByPrimaryKey( id );
        JsonResult jsonResult = new JsonResult( 1, examConfig );
        return jsonResult;
    }

    @RequestMapping("/admin/EC/addEC.do")
    @ResponseBody
    public JsonResult addEC(ExamConfig examConfig) {
        Date starttime = examConfig.getStarttime();
        Date endtime = examConfig.getEndtime();

        if (endtime.compareTo( starttime ) > 0 ) {
            examConfigService.insert( examConfig );
            JsonResult jsonResult = new JsonResult( 1, null );
            return jsonResult;
        } else {
            JsonResult jsonResult = new JsonResult(0,"考试结束时间有误");
            return jsonResult;
        }


    }


    @RequestMapping("/admin/EC/deleteEC.do")
    @ResponseBody
    public JsonResult deleteEC(Integer id) {
        examConfigService.deleteByPrimaryKey( id );
        JsonResult jsonResult = new JsonResult( 1, null );
        return jsonResult;
    }

    @RequestMapping("/admin/EC/deleteECs.do")
    @ResponseBody
    public JsonResult deleteECs(Integer[] ids) {
        examConfigService.deleteExamConfigByIds( ids );
        JsonResult jsonResult = new JsonResult( 1, null );
        return jsonResult;
    }

    @RequestMapping("/admin/EC/updateEC.do")
    @ResponseBody
    public JsonResult updateEC(ExamConfig examConfig) {
        examConfigService.updateByPrimaryKey( examConfig );
        JsonResult jsonResult = new JsonResult( 1, null );
        return jsonResult;
    }


    @RequestMapping("/admin/EC/selectName.do")
    @ResponseBody

    public JsonResult selectName() {
        List<User> list = examConfigService.selectUser();
        JsonResult jsonResult = new JsonResult( 1, list );
        return jsonResult;
    }


}

