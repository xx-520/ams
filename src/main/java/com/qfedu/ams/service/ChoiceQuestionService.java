package com.qfedu.ams.service;

import com.qfedu.ams.entity.ChoiceQuestion;

import java.util.List;
import java.util.Map;

public interface ChoiceQuestionService {

    List<ChoiceQuestion> findAll();

    int falseDelete(Integer id);

    void falseDeletes(Integer[] ids);

    int insert(ChoiceQuestion record);

    ChoiceQuestion selectByPrimaryKey(Integer id);

    int update(ChoiceQuestion record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);
}
