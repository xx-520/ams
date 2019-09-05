package com.qfedu.ams.service;

import com.qfedu.ams.entity.AmsExam;
import com.qfedu.ams.entity.ChoiceQuestion;
import com.qfedu.ams.entity.JudgeQuestion;
import com.qfedu.ams.entity.ShortQuestion;

import java.util.List;
import java.util.Map;

public interface AmsExamService {

    String CQfindAll(Integer subjectid, Integer num);

    List<AmsExam> findAll();

    int deleteById(Integer id);

    int add(AmsExam record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);
    AmsExam findById(Integer id);

    void update(AmsExam amsExam);

    public List<ChoiceQuestion> findChoiceQuestion(Integer id);

    public List<JudgeQuestion> findJudegQuestion(Integer id);

    public List<ShortQuestion> findShortQuestion(Integer id);
}
