package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ChoiceQuestion;
import com.qfedu.ams.entity.ChoiceQuestionWithBLOBs;
//选择题表
public interface ChoiceQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChoiceQuestionWithBLOBs record);

    int insertSelective(ChoiceQuestionWithBLOBs record);

    ChoiceQuestionWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChoiceQuestionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ChoiceQuestionWithBLOBs record);

    int updateByPrimaryKey(ChoiceQuestion record);
}