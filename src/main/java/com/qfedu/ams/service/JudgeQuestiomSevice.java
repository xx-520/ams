package com.qfedu.ams.service;


import com.qfedu.ams.entity.JudgeQuestion;

import java.util.List;
import java.util.Map;

public interface JudgeQuestiomSevice {

    List<JudgeQuestion> findAll();

    int falseDelete(Integer id);

    void falseDeletes(Integer[] ids);

    int insert(JudgeQuestion record);

    JudgeQuestion selectByPrimaryKey(Integer id);

    void update(JudgeQuestion record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);
}
