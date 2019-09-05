package com.qfedu.ams.dao;

import com.qfedu.ams.entity.ChoiceQuestion;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 选择题 dao层
 */
public interface ChoiceQuestionMapper {

    List<Integer> CQfindAll(@Param("subjectid") Integer subjectid,@Param("num") Integer num);

    List<ChoiceQuestion> findAll();

    List<ChoiceQuestion> findRecover();

    int falseDelete(Integer id);

    void falseDeletes(Integer[] ids);

    void recoverCQ(Integer[] ids);

    int insert(ChoiceQuestion record);

    ChoiceQuestion selectByPrimaryKey(Integer id);

    int update(ChoiceQuestion record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);

    Map<String ,Object> findByIndexAndSize2(Integer page, Integer limit);

    void inserts(List<ChoiceQuestion> list);

}