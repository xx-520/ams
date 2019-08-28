package com.qfedu.ams.dao;

import com.qfedu.ams.entity.AmsExam;

public interface AmsExamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmsExam record);

    int insertSelective(AmsExam record);

    AmsExam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmsExam record);

    int updateByPrimaryKey(AmsExam record);
}