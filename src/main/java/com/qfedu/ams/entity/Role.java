package com.qfedu.ams.entity;

import lombok.Data;
//角色管理
@Data // 自动生成对应的getter和setter方法
public class Role {
    private Integer id;
    private String role;//角色名称
}
