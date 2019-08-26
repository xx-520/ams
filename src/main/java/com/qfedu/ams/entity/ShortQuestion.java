package com.qfedu.ams.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
//简答题
@Data // 自动生成对应的getter和setter方法
public class ShortQuestion {
    private Integer id;
    private Integer score;//简答题分数
    private String question;//简答题题目
    private Integer subjectId;//科目ID
}
