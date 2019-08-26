package com.qfedu.ams.entity;

import lombok.Data;
//选择题
@Data // 自动生成对应的getter和setter方法
public class ChoiceQestion {
    private Integer id;
    private Integer score;//选择题分数
    private String question;//选择题题目
    private String choiceA;//选择题答案A
    private String choiceB;//选择题答案B
    private String choiceC;//选择题答案C
    private String choiceD;//选择题答案D
    private String rightAnswer;//正确答案
    private Integer subjectId;//学科ID
 }
