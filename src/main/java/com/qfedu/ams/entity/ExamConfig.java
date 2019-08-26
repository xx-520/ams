package com.qfedu.ams.entity;

import lombok.Data;
import java.util.Date;

@Data // 自动生成对应的getter和setter方法
public class ExamConfig {
    private Integer id;
    private Integer userId;
    private Date startTime;
    private Date endTime;
    private Integer examNum;
    private Integer subjectId;
}
