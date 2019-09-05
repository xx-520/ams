package com.qfedu.ams.dao;

import com.qfedu.ams.entity.AmsExam;
import com.qfedu.ams.entity.ChoiceQuestion;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 试题表
 *
 * @author xx
 */
public interface AmsExamMapper {

    List<Integer> CQfindAll(@Param("subjectid") Integer subjectid,@Param("num") Integer num);

    List<AmsExam> findAll();

    int deleteById(Integer id);

    int add(AmsExam record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);

}