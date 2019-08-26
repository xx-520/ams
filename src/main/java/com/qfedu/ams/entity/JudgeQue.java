package com.qfedu.ams.entity;

import lombok.Data;

@Data // 自动生成对应的getter和setter方法
public class JudgeQue {
    private Integer id;
    private Integer score;
    private String question;
    private Integer choiceA;
    private Integer choiceB;
    private Integer judgeAnswer;
    private Integer subjectId;
}
