package com.qfedu.ams.service;

import com.qfedu.ams.entity.ChoiceQuestion;

import java.util.List;
import java.util.Map;

public interface ChoiceQuestionService {

    void recoverCQ(Integer[] ids);

    String CQfindAll(Integer subjectid,Integer num);

    List<ChoiceQuestion> findRecover();

    List<ChoiceQuestion> findAll();

    int falseDelete(Integer id);

    void falseDeletes(Integer[] ids);

    int insert(ChoiceQuestion record);

    ChoiceQuestion selectByPrimaryKey(Integer id);

    int update(ChoiceQuestion record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);

    Map<String ,Object> findByIndexAndSize2(Integer page, Integer limit);

    void inserts(List<ChoiceQuestion> list);
}
