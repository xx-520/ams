package com.qfedu.ams.service;

import com.qfedu.ams.entity.ChoiceQuestion;

import java.util.List;
import java.util.Map;

public interface ChoiceQuestionService {

    List<ChoiceQuestion> findAll();

    int falseDelete(Integer id);

    int insert(ChoiceQuestion record);

    ChoiceQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChoiceQuestion record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);
}
