package com.qfedu.ams.service.impl;

import com.qfedu.ams.dao.ExamSubjectMapper;
import com.qfedu.ams.entity.ExamSubject;
import com.qfedu.ams.service.ExamSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
