package com.qfedu.ams.service;


import com.qfedu.ams.entity.JudgeQuestion;

import java.util.List;
import java.util.Map;

public interface JudgeQuestiomSevice {

    void recoverJQ(Integer[] ids);

    String CQfindAll(Integer subjectid,Integer jnum);

    List<JudgeQuestion> findRecover();

    List<JudgeQuestion> findAll();

    int falseDelete(Integer id);

    void falseDeletes(Integer[] ids);

    int insert(JudgeQuestion record);

    JudgeQuestion selectByPrimaryKey(Integer id);

    void update(JudgeQuestion record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);

    Map<String ,Object> findByIndexAndSize2(Integer page, Integer limit);

    void inserts(List<JudgeQuestion> list);
}
