package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ExamConfig;
//考试时间表
public interface ExamConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamConfig record);

    int insertSelective(ExamConfig record);

    ExamConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamConfig record);

    int updateByPrimaryKey(ExamConfig record);
}