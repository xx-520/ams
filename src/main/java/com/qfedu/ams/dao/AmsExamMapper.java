package com.qfedu.ams.dao;

import com.qfedu.ams.entity.AmsExam;
import com.qfedu.ams.entity.ChoiceQuestion;

import java.util.List;

/**
 * 试题表
 *
 * @author xx
 */
public interface AmsExamMapper {

    List<AmsExam> findAll();

    int deleteById(Integer id);

    int add(AmsExam record);

    AmsExam findById(Integer id);

    void update(AmsExam amsExam);

}