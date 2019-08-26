package com.qfedu.ams.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // 自动生成对应的getter和setter方法
public class ShortQuestion {
    private Integer id;
    private Integer score;
    private String question;
    private Integer subject;
}
