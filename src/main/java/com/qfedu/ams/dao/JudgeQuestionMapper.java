package com.qfedu.ams.dao;

import com.qfedu.ams.entity.JudgeQuestion;

public interface JudgeQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JudgeQuestion record);

    int insertSelective(JudgeQuestion record);

    JudgeQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JudgeQuestion record);

    int updateByPrimaryKeyWithBLOBs(JudgeQuestion record);

    int updateByPrimaryKey(JudgeQuestion record);
}