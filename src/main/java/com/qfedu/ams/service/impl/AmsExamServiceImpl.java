package com.qfedu.ams.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.ams.dao.AmsExamMapper;
import com.qfedu.ams.entity.AmsExam;
import com.qfedu.ams.entity.ChoiceQuestion;
import com.qfedu.ams.entity.JudgeQuestion;
import com.qfedu.ams.entity.ShortQuestion;
import com.qfedu.ams.service.AmsExamService;
import com.qfedu.ams.utils.ListToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xx
 */
@Service
public class AmsExamServiceImpl implements AmsExamService {

    @Autowired(required = false)
    private AmsExamMapper amsExamMapper;

    @Override
    public String CQfindAll(Integer subjectid, Integer num) {
        List<Integer> list = amsExamMapper.CQfindAll(subjectid, num);
        String string = ListToString.create(list);

        return string;
    }

    @Override
    public List<AmsExam> findAll() {
        List<AmsExam> list = amsExamMapper.findAll();
        if (list == null){
            throw new RuntimeException("试卷不存在");
        }
        return list;
    }

    @Override
    public int deleteById(Integer id) {
        return amsExamMapper.deleteById(id);
    }

    @Override
    public int add(AmsExam record) {
        return amsExamMapper.add(record);
    }

    @Override
    public Map<String, Object> findByIndexAndSize(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<AmsExam> list = amsExamMapper.findAll();
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
    public AmsExam findById(Integer id) {
        return null;
    }

    @Override
    public void update(AmsExam amsExam) {

    }


    @Override
    public List<ChoiceQuestion> findChoiceQuestion(Integer id) {
        List<ChoiceQuestion> list = amsExamMapper.findChoiceQuestion(id);
        return list;
    }

    @Override
    public List<JudgeQuestion> findJudegQuestion(Integer id) {
        List<JudgeQuestion> judegQuestion = amsExamMapper.findJudegQuestion(id);
        return judegQuestion;
    }

    @Override
    public List<ShortQuestion> findShortQuestion(Integer id) {
        List<ShortQuestion> shortQuestion = amsExamMapper.findShortQuestion(id);
        return shortQuestion;
    }
}
