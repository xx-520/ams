package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ExamSubject;

public interface ExamSubjectMapper {
    int deleteByPrimaryKey(Integer subjectid);

    int insert(ExamSubject record);

    int insertSelective(ExamSubject record);

    ExamSubject selectByPrimaryKey(Integer subjectid);

    int updateByPrimaryKeySelective(ExamSubject record);

    int updateByPrimaryKey(ExamSubject record);
}