package com.qfedu.ams.entity;


import lombok.Data;
//后台管理员
@Data // 自动生成对应的getter和setter方法
public class Admin {
    private Integer id;
    private String username;//用户名
    private String password;//用户密码
    private Integer roleId;//角色ID
}
