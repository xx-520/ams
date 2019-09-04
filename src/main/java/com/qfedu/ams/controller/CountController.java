package com.qfedu.ams.controller;


import com.qfedu.ams.entity.Count;
import com.qfedu.ams.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping
public class CountController {

    @Autowired(required = false)
    private CountService countService;

    @RequestMapping("/count.do")
    @ResponseBody
    public Map<String, List> findAllRole() {
        List<Count> list = countService.findAllCount();
        List<String> subjectName = new ArrayList<>();
        List<Integer> total = new ArrayList<>();

        for (Count count : list) {
            subjectName.add(count.getSubjectName());
            total.add(count.getTotal());
        }

        Map<String, List> map = new HashMap<>();
        map.put("subjectName", subjectName);
        map.put("total", total);

        return map;
    }

}
