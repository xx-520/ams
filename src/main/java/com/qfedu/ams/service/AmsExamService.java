package com.qfedu.ams.service;

import com.qfedu.ams.entity.AmsExam;
import com.qfedu.ams.entity.ChoiceQuestion;

import java.util.List;

public interface AmsExamService {

    List<AmsExam> findAll();

    int deleteById(Integer id);

    int add(AmsExam record);

    AmsExam findById(Integer id);

    void update(AmsExam amsExam);
}
