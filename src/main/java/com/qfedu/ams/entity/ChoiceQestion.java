package com.qfedu.ams.entity;

import lombok.Data;

@Data // 自动生成对应的getter和setter方法
public class ChoiceQestion {
    private Integer id;
    private Integer score;
    private String question;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String rightAnswer;
    private Integer subjectId;
}
