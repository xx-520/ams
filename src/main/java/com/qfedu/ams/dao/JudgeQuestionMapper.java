package com.qfedu.ams.dao;

import com.qfedu.ams.entity.JudgeQuestion;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 判断题dao层
 */
public interface JudgeQuestionMapper {

    List<Integer> CQfindAll(@Param("subjectid") Integer subjectid, @Param("jnum") Integer jnum);

    List<JudgeQuestion> findAll();

    List<JudgeQuestion> findRecover();

    int falseDelete(Integer id);

    void falseDeletes(Integer[] ids);

    void recoverJQ(Integer[] ids);

    int insert(JudgeQuestion record);

    JudgeQuestion selectByPrimaryKey(Integer id);

    void update(JudgeQuestion record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);

    Map<String ,Object> findByIndexAndSize2(Integer page, Integer limit);

    void inserts(List<JudgeQuestion> list);

}