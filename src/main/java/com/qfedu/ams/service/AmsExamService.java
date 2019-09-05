package com.qfedu.ams.service;

import com.qfedu.ams.entity.AmsExam;
import com.qfedu.ams.entity.ChoiceQuestion;

import java.util.List;
import java.util.Map;

public interface AmsExamService {

    String CQfindAll(Integer subjectid, Integer num);

    List<AmsExam> findAll();

    int deleteById(Integer id);

    int add(AmsExam record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);
}
