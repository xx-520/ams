package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ChoiceQuestion;

import java.util.List;
import java.util.Map;

/**
 * 选择题 dao层
 */
public interface ChoiceQuestionMapper {

    List<ChoiceQuestion> findAll();

    int falseDelete(Integer id);

    int insert(ChoiceQuestion record);

    ChoiceQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChoiceQuestion record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);


}