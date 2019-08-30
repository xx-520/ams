package com.qfedu.ams.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.ams.dao.ExamSubjectMapper;
import com.qfedu.ams.entity.ExamSubject;
import com.qfedu.ams.service.ExamSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 学科实现层
 *
 * @author xx
 */
@Service
public class ExamSubjectServiceImpl implements ExamSubjectService {

    @Autowired(required = false)
    private ExamSubjectMapper examSubjectMapper;

    @Override
    public List<ExamSubject> findAll() {
        return examSubjectMapper.findAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer subjectid) {
        return examSubjectMapper.deleteByPrimaryKey(subjectid);
    }

    @Override
    public int insert(ExamSubject record) {
        return examSubjectMapper.insert(record);
    }

    @Override
    public ExamSubject selectByPrimaryKey(Integer subjectid) {
        return examSubjectMapper.selectByPrimaryKey(subjectid);
    }

    @Override
    public int updateByPrimaryKey(ExamSubject record) {
        return examSubjectMapper.updateByPrimaryKey(record);
    }

    @Override
    public Map<String, Object> findByIndexAndSize(String subjectName, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<ExamSubject> list = examSubjectMapper.findByIndexAndSize(subjectName,page,limit);
        // 获取总记录数
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }
}
