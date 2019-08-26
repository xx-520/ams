package com.qfedu.ams.entity;

import lombok.Data;
import java.util.Date;
//考试时间表
@Data // 自动生成对应的getter和setter方法
public class ExamConfig {
    private Integer id;
    private Integer userId;//用户ID
    private Date startTime;//考试开始时间
    private Date endTime;//考试结束时间
    private Integer examNum;//考试场次
    private Integer subjectId;//学科ID
}
