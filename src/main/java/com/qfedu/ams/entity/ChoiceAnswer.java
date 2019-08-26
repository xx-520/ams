package com.qfedu.ams.entity;

import lombok.Data;
//选择题回答表
@Data // 自动生成对应的getter和setter方法
public class ChoiceAnswer {
    private Integer id;
    private Integer userId;//用户ID
    private Integer choiceId;//题目ID
    private String answer;//回答答案
}
