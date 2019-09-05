package com.qfedu.ams.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.ams.dao.MarkShortMapper;
import com.qfedu.ams.service.MarkShortService;
import com.qfedu.ams.vo.MarkShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MarkShortImpl implements MarkShortService {


    @Autowired(required = false)
    private MarkShortMapper markShortMapper;

    @Override
    public Map<String, Object> findShortByExamId(Integer username, String name, Integer page, Integer userId, Integer limit, Integer totalShortScore, String subjectName, String referenceanswer) {


        PageHelper.startPage(page, limit);

        List<MarkShort> list = markShortMapper.findShortByExamId(username, name,totalShortScore,subjectName,referenceanswer,userId);

// 获取总记录数
        long total = ((Page) list).getTotal();
        // 获取总页数
        int pages = ((Page) list).getPages();

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }
//
//    @Override
//    public Map<String, Object> findShortByExamId(Integer username, String name, Integer page, Integer uid, Integer limit, Integer totalShortScore, String subjectName, String referenceanswer) {
//
//
//
//        return null;
//    }

    @Override
    public MarkShort findByUserId(Integer userId,Integer examId) {
        return markShortMapper.findByUserId(userId,examId);
    }

    @Override
    public void updateMarkShort(MarkShort markShort) {
        markShortMapper.updateMarkShort(markShort);
    }
}
