package com.qfedu.ams.entity;

import lombok.Data;
//判断题
@Data // 自动生成对应的getter和setter方法
public class JudgeQuestion {
    private Integer id;
    private Integer score;//判断题分数
    private String question;//判断题题目
    private Integer choiceA;//判断选项 0
    private Integer choiceB;//判断选择 1
    private Boolean judgeAnswer;//正确答案
    private Integer subjectId;//学科ID
}
