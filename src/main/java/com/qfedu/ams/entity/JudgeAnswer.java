package com.qfedu.ams.entity;

import lombok.Data;
//判断题
@Data // 自动生成对应的getter和setter方法
public class JudgeAnswer {
    private Integer id;
    private Integer userId;//用户ID
    private Integer judgeId;//判断ID
    private Integer answer;//回答答案
}
