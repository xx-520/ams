package com.qfedu.ams.entity;

import lombok.Data;
//考试分数
@Data // 自动生成对应的getter和setter方法
public class Score {
    private Integer id;
    private Integer choiceScore; //单选题分数
    private Integer totalJudgeScore; //多选题分数
    private Integer totalShortScore; //简答题分数
    private Integer totalScore; //总分
}
