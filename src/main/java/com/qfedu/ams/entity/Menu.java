package com.qfedu.ams.entity;

import lombok.Data;

@Data // 自动生成对应的getter和setter方法
public class Menu {
    private Integer id;
    private Integer roleId;
    private String url;
}
