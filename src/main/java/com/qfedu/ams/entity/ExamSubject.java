package com.qfedu.ams.entity;

import lombok.Data;
//学科表
@Data // 自动生成对应的getter和setter方法
public class ExamSubject {
    private Integer subjectId;//学科ID
    private String subjectName;//学科名字
}
