package com.qfedu.ams.entity;

import lombok.Data;

@Data // 自动生成对应的getter和setter方法
public class ChoiceAnswer {
    private Integer id;
    private Integer userId;
    private Integer choiceId;
    private String answer;
}
