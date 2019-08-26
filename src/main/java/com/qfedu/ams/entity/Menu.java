package com.qfedu.ams.entity;

import lombok.Data;
//系统管理
@Data // 自动生成对应的getter和setter方法
public class Menu {
    private Integer id;
    private Integer roleId;//角色ID
    private String url;//哪个页面URL
}
