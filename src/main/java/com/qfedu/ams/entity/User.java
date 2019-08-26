package com.qfedu.ams.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
//考生信息
@Data // 自动生成对应的getter和setter方法
public class User {
    private Integer id;
    private String username; // 学号（登录名）
    private String name; //姓名
    private String sex; //性别
    private String phone; //手机号
    private String email; //邮箱
    private Integer scoreId; //分数Id
    private Integer lock; //标识考生是否提交试卷(默认设为 0， 0代表不提交，1代表提交)
    private Integer subjectId; //学科ID
}
