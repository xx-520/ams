package com.qfedu.ams.controller;

import com.github.pagehelper.Page;
import com.qfedu.ams.common.JsonResult;
import com.qfedu.ams.entity.Score;
import com.qfedu.ams.service.ScoreService;
import com.qfedu.ams.vo.UserScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ScoreController {

    @Autowired(required = false)
    private ScoreService scoreService;

    @RequestMapping("/Score/list.do")
    @ResponseBody
    public Map<String,Object> findAll(Integer page,Integer limit) {

        List<UserScore> list = scoreService.findAllScore(page, limit);

        long total = ((Page) list).getTotal();

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }

    @RequestMapping("/Score/delete.do")
    @ResponseBody
    public JsonResult deleteScore(Integer id) {
        scoreService.deleteScore(id);

        return new JsonResult(1,null);
    }


    @RequestMapping("/Score/query.do")
    @ResponseBody
    public JsonResult query(Integer id) {
        Score score = scoreService.findById(id);

        return new JsonResult(1,score);
    }

    @RequestMapping("/Score/update.do")
    @ResponseBody
    public JsonResult update(Score score) {

        scoreService.updateScore(score);

        return new JsonResult(1,null);


    }

    @RequestMapping("/Score/deleteMany.do")
    @ResponseBody
    public Map<String,Object> deleteMany(@RequestParam(value = "ids") List<Integer> ids) {

        Map<String,Object> map = new HashMap<>();

        int i = scoreService.deleteMany(ids);

        if (i > 0 ) {
                map.put("code",1);
                map.put("info","删除成功");
        }else{
            map.put("code",0);
            map.put("info","删除失败");
        }

        return map;
    }

    @RequestMapping("/Score/findList.do")
    @ResponseBody
    public Map<String,Object> findList(String name, String subjectName, Integer page, Integer limit){

        Map<String, Object> map = new HashMap<>();

        List<Score> list = scoreService.findList(name, subjectName, page, limit);

        long total = ((Page) list).getTotal();

        map.put("code", 0); // 结合layui的表格组件，0表示成功
        map.put("msg","");
        map.put("count", total);// 表中总记录数
        map.put("data", list);

        return map;
    }

}
