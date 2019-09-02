package com.qfedu.ams.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.ams.dao.JudgeQuestionMapper;
import com.qfedu.ams.entity.JudgeQuestion;
import com.qfedu.ams.service.JudgeQuestiomSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 判断题实现
 *
 */
@Service
public class JudgeQuestiomSeviceImpl implements JudgeQuestiomSevice {

    @Autowired(required = false)
    private JudgeQuestionMapper judgeQuestionMapper;

    @Override
    public List<JudgeQuestion> findAll() {
        List<JudgeQuestion> list = judgeQuestionMapper.findAll();
        if (list == null){
            throw new RuntimeException("题目不存在");
        }
        return list;
    }

    @Override
    public int falseDelete(Integer id) {
        return judgeQuestionMapper.falseDelete(id);
    }

    @Override
    public void falseDeletes(Integer[] ids) {
        judgeQuestionMapper.falseDeletes(ids);
    }

    @Override
    public int insert(JudgeQuestion record) {
        return judgeQuestionMapper.insert(record);
    }

    @Override
    public JudgeQuestion selectByPrimaryKey(Integer id) {
        return judgeQuestionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(JudgeQuestion record) {
        return judgeQuestionMapper.update(record);
    }

    @Override
    public Map<String, Object> findByIndexAndSize(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<JudgeQuestion> list = judgeQuestionMapper.findAll();
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
