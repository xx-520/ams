package com.qfedu.ams.entity;

import lombok.Data;

@Data // 自动生成对应的getter和setter方法
public class JudgeAnswer {
    private Integer id;
    private Integer userId;
    private Integer judgeId;
    private Integer answer;
}
