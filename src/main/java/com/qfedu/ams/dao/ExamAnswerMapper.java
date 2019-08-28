package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ExamAnswer;

public interface ExamAnswerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamAnswer record);

    int insertSelective(ExamAnswer record);

    ExamAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamAnswer record);

    int updateByPrimaryKey(ExamAnswer record);
}