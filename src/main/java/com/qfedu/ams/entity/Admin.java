package com.qfedu.ams.entity;


import lombok.Data;

@Data // 自动生成对应的getter和setter方法
public class Admin {
    private Integer id;
    private String username;
    private String password;
    private Integer roleId;
}
