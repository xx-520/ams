package com.qfedu.ams.service;

import com.qfedu.ams.vo.MarkShort;

import java.util.List;
import java.util.Map;

public interface MarkShortService {

    //根据考试的场次的Id查询考生的简答题的答案
    public Map<String,Object> findShortByExamId(Integer username, String name, Integer page,Integer userId,
                                                Integer limit,Integer totalShortScore,String subjectName,String referenceanswer);


    public MarkShort findByUserId(Integer userId,Integer examId);

    public void updateMarkShort(MarkShort markShort);
}
