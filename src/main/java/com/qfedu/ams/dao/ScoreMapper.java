package com.qfedu.ams.dao;

import com.qfedu.ams.entity.Score;
//分数表
public interface ScoreMapper {
    /**
     * 根据用户ID查找用户分数
     */
    public void selectScore(Integer id);
}