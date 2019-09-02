package com.qfedu.ams.dao;

import com.qfedu.ams.entity.JudgeQuestion;

import java.util.List;
import java.util.Map;

/**
 * 判断题dao层
 */
public interface JudgeQuestionMapper {

    List<JudgeQuestion> findAll();

    int falseDelete(Integer id);

    void falseDeletes(Integer[] ids);

    int insert(JudgeQuestion record);

    JudgeQuestion selectByPrimaryKey(Integer id);

    void update(JudgeQuestion record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);

}