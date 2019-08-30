package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ChoiceQuestion;

//选择题表
public interface ChoiceQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChoiceQuestion record);

    ChoiceQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChoiceQuestion record);

    int updateByPrimaryKeyWithBLOBs(ChoiceQuestion record);

    int updateByPrimaryKey(ChoiceQuestion record);
}