package com.qfedu.ams.service.impl;

import com.qfedu.ams.dao.AmsExamMapper;
import com.qfedu.ams.entity.AmsExam;
import com.qfedu.ams.entity.ChoiceQuestion;
import com.qfedu.ams.service.AmsExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AmsExamServiceImpl implements AmsExamService {

    @Autowired(required = false)
    private AmsExamMapper amsExamMapper;

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
        return 0;
    }

    @Override
    public int add(AmsExam record) {
        return 0;
    }

    @Override
    public AmsExam findById(Integer id) {
        return null;
    }

    @Override
    public void update(AmsExam amsExam) {

    }
}
