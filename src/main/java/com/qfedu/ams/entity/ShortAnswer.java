package com.qfedu.ams.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.annotations.Param;

@Data // 自动生成对应的getter和setter方法
public class ShortAnswer {
    private Integer id;
    private Integer userId;
    private Integer shortId;
    private String answer;
    private Integer shortScore;
}
