package com.qfedu.ams.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // 自动生成对应的getter和setter方法
public class Score {
    private Integer id;
    private Integer choiceScore;
    private Integer totalJudgeScore;
    private Integer totalShortScore;
    private Integer totalScore;
}
