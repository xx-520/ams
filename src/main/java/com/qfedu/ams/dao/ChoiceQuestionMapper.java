package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ChoiceQuestion;

import java.util.List;

/**
 * 选择题 dao层
 */
public interface ChoiceQuestionMapper {

    List<ChoiceQuestion> findAll(ChoiceQuestion choiceQuestion);

    int falseDelete(Integer id);

    int insert(ChoiceQuestion record);

    ChoiceQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChoiceQuestion record);


}