package com.qfedu.ams.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.annotations.Param;
//简答题回答表
@Data // 自动生成对应的getter和setter方法
public class ShortAnswer {
    private Integer id;
    private Integer userId;//用户ID
    private Integer shortId;//简答题ID
    private String answer;//回答答案
    private Integer shortScore;//答题分数(开始为零，评分后更新)
}
