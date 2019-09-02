package com.qfedu.ams.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.ams.dao.ChoiceQuestionMapper;
import com.qfedu.ams.entity.ChoiceQuestion;
import com.qfedu.ams.service.ChoiceQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChoiceQuestionServiceImpl implements ChoiceQuestionService {

    @Autowired(required = false)
    private ChoiceQuestionMapper choiceQuestionMapper;

    @Override
    public List<ChoiceQuestion> findAll() {
        List<ChoiceQuestion> list = choiceQuestionMapper.findAll();
        if (list == null){
            throw new RuntimeException("题目不存在");
        }
        return list;
    }

    @Override
    public int falseDelete(Integer id) {
        return choiceQuestionMapper.falseDelete(id);
    }

    @Override
    public void falseDeletes(Integer[] ids) {
        choiceQuestionMapper.falseDeletes(ids);
    }

    @Override
    public int insert(ChoiceQuestion record) {
        return choiceQuestionMapper.insert(record);
    }

    @Override
    public ChoiceQuestion selectByPrimaryKey(Integer id) {
        return choiceQuestionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(ChoiceQuestion record) {
        return choiceQuestionMapper.update(record);
    }

    @Override
    public Map<String, Object> findByIndexAndSize(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<ChoiceQuestion> list = choiceQuestionMapper.findAll();
        // 获取总记录数
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }

    @Override
    public void inserts(List<ChoiceQuestion> list) {
        choiceQuestionMapper.inserts(list);
    }
}
