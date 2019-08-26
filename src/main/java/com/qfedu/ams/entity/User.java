package com.qfedu.ams.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // 自动生成对应的getter和setter方法
public class User {
    private Integer id;
    private String username;
    private String name;
    private String sex;
    private String phone;
    private String email;
    private Integer scoreId;
    private Integer lock;
    private Integer subjectId;
}
