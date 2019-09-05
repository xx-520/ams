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

    List<AmsExam> findRecover();

    int deleteById(Integer id);

    void recoverAE(Integer[] ids);

    int add(AmsExam record);

    Map<String ,Object> findByIndexAndSize(Integer page, Integer limit);

    Map<String ,Object> findByIndexAndSize2(Integer page, Integer limit);

    public List<ChoiceQuestion> findChoiceQuestion(Integer id);

    public List<JudgeQuestion> findJudegQuestion(Integer id);

    public List<ShortQuestion> findShortQuestion(Integer id);
}
